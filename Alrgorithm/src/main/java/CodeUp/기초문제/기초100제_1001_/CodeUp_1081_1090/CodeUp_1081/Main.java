package CodeUp.기초문제.기초100제_1001_.CodeUp_1081_1090.CodeUp_1081;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
