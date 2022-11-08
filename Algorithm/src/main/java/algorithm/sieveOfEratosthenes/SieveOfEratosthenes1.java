package algorithm.sieveOfEratosthenes;

import java.util.ArrayList;

public class SieveOfEratosthenes1 {
    // 소수여부를 판단해주는 배열을 따로 생성하여 구현
    public int solution(int N) {
        // 2~N까지 리스트에 넣기
        boolean[] checks = new boolean[N+1];

        checks[0] = false;
        checks[1] = false;

        for (int i = 2; i < N+1; i++) {
            checks[i] = true;
        }

        // 2부터 루트 N까지 나누며 배수 제거
        for (int i = 2; i * i < N+1; i++) {
            for (int j = i*i; j < N+1; j+=i) {
                if(j % i == 0) {
                    checks[j] = false;
                }
            }
        }

        // 소수 리스트를 따로 생성
        ArrayList<Integer> primeNum = new ArrayList<>();
        for (int i = 0; i < N+1; i++) {
            if(checks[i]){
                primeNum.add(i);
            }
        }

        return primeNum.size();
    }
}
