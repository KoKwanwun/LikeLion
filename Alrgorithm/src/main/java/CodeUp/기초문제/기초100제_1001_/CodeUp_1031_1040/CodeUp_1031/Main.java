package CodeUp.기초문제.기초100제_1001_.CodeUp_1031_1040.CodeUp_1031;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String octNum = Integer.toOctalString(num);

        System.out.println(octNum);
    }
}
