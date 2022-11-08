package CodeUp.기초문제.기초100제_1001_.CodeUp_1081_1090.CodeUp_1082;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int HexNum = sc.nextInt(16);

        for (int i = 1; i <= 15; i++) {
            System.out.printf("%X*%X=%X\n", HexNum, i, i*HexNum);
        }
    }
}