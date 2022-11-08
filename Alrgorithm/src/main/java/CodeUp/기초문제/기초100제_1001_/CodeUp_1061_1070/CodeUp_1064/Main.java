package CodeUp.기초문제.기초100제_1001_.CodeUp_1061_1070.CodeUp_1064;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int min = a < b ? a : b;
        min = min < c ? min : c;

        System.out.println(min);
    }
}
