package CodeUp.기초문제.기초100제_1001_.CodeUp_1021_1030.CodeUp_1023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String strs[] = str.split("\\.");

        System.out.println(strs[0]);
        System.out.println(strs[1]);
    }
}