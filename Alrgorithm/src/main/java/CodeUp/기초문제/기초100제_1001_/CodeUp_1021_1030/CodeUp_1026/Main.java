package CodeUp.기초문제.기초100제_1001_.CodeUp_1021_1030.CodeUp_1026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] chars = str.split(":");

        System.out.printf("%02d", Integer.parseInt(chars[1]));
    }
}
