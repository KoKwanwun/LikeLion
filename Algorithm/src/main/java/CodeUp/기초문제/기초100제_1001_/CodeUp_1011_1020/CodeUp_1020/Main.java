package CodeUp.기초문제.기초100제_1001_.CodeUp_1011_1020.CodeUp_1020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] splitStr = str.split("-");

        int num1 = Integer.parseInt(splitStr[0]);
        int num2 = Integer.parseInt(splitStr[1]);

        System.out.printf("%06d%07d", num1, num2);
    }
}