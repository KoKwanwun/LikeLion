package CodeUp.기초문제.재귀함수_1901_.CodeUp_1904;

import java.util.Scanner;

public class Main {
    public static void printOdd(int start, int end) {
        if(start > end){
            return;
        }
        // 홀수만 출력
        if(start % 2 == 1){
            System.out.print(start + " ");
        }
        printOdd(start + 1, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        printOdd(start, end);
    }
}
