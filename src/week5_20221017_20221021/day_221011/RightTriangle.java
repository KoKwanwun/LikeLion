package week5_20221017_20221021.day_221011;

import java.util.Scanner;

public class RightTriangle {
    void printRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        rightTriangle.printRightTriangle(n);
    }
}
