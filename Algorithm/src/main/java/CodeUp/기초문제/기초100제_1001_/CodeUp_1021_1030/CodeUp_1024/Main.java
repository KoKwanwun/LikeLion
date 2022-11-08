package CodeUp.기초문제.기초100제_1001_.CodeUp_1021_1030.CodeUp_1024;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] chars = str.split("");

        for (String aChar : chars) {
            System.out.println("'" + aChar + "'");
        }
    }
}
