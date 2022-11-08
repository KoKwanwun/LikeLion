package CodeUp.기초문제.기초100제_1001_.CodeUp_1021_1030.CodeUp_1025;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length()-1;
        String[] chars = str.split("");

        for (String aChar : chars) {
            int tmp =Integer.parseInt(aChar);
            tmp *= Math.pow(10, len);
            System.out.println("[" + tmp + "]");
            len -= 1;
        }
    }
}
