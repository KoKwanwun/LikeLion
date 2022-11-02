package week7_20221031_20221103.day_221102;

import java.util.ArrayList;

public class SieveOfEratosthenes {
    // 이렇게 구현하면 직관적으로 코드를 이해하기 쉽지만 속도가 느림
    public int solution(int N) {
        // 2~N까지 리스트에 넣기
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            arr.add(i);
        }

        // 2부터 루트 N까지 나누며 배수 제거
        for (int i = 2; i * i <= N; i++) {
            for (int j = 0; j < arr.size(); j++) {
                if(arr.get(j) % i == 0 && arr.get(j) > i) {
                    arr.remove(j);
                }
            }
        }

        return arr.size();
    }
}
