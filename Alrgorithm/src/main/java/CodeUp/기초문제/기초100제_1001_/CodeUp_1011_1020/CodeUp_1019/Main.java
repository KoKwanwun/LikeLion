package CodeUp.기초문제.기초100제_1001_.CodeUp_1011_1020.CodeUp_1019;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] splitStr = str.split("\\.");

        int year = Integer.parseInt(splitStr[0]);
        int month = Integer.parseInt(splitStr[1]);
        int day = Integer.parseInt(splitStr[2]);

        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
