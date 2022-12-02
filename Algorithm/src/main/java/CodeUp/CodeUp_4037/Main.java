package CodeUp.CodeUp_4037;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 소인수분해를 하기 위해 num이 1이 될때까지 for문이 돌아가도록 감
        // 이렇게 하면 소수로 나눠줄 수 있고, 오름차순 정렬 가능
        for (int i = 2; i <= num; i++) {
            if(num % i == 0){
                num /= i;
                System.out.print(i + " ");
                i = 1;
            }
        }
    }
}
