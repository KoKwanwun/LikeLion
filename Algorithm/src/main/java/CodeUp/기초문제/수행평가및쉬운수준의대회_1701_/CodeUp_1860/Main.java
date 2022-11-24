package CodeUp.기초문제.수행평가및쉬운수준의대회_1701_.CodeUp_1860;

import java.util.Scanner;

public class Main {
    // 각 층에 맞는 수를 출력하는 메소드
    public static void printNum(int num, int startNum) {
        if(startNum > num){
            return;
        }
        System.out.print(startNum + " ");
        printNum(num, startNum + 1);
    }

    // 각 층을 정해는 메소드
    public static void printTriangle(int n, int num) {
        if(num > n){
            return;
        }
        printNum(num, 1);
        System.out.println();
        printTriangle(n, num + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printTriangle(n, 1);
    }
}
