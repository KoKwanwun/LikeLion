package CodeUp.기초문제.반복문_1251_.CodeUp_1278;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = 0;

        // 나누기를 이용한 자릿수 구하기
        while(num > 0){
            num /= 10;
            result += 1;
        }
        System.out.println(result);
    }
}
