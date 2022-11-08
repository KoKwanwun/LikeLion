package CodeUp.기초문제.기초100제_1001_.CodeUp_1031_1040.CodeUp_1035;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int DecNum = Integer.parseInt(num, 16);

        String OctNum = Integer.toOctalString(DecNum);

        System.out.println(OctNum);
    }
}
