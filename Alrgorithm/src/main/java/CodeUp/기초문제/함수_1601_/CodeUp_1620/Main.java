package CodeUp.기초문제.함수_1601_.CodeUp_1620;

import java.util.Scanner;

public class Main {
    // 자릿수 합 구하는 함수
    int sumEachDigit(int num) {
        int result = 0;

        while(num > 0) {
            result += num % 10;
            num = num / 10;
        }

        return result;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 입력받은 정수가 한 자리가 될때까지 함수 반복
        while(num / 10 > 0){
            num = main.sumEachDigit(num);
        }

        System.out.println(num);
    }
}
