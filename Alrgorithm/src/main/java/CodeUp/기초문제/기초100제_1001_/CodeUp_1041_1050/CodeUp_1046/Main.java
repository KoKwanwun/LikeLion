package CodeUp.기초문제.기초100제_1001_.CodeUp_1041_1050.CodeUp_1046;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(a + b + c);
        System.out.printf("%.01f", (double) (a + b + c) / 3);
    }
}
