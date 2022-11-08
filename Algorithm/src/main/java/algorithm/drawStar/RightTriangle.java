package algorithm.drawStar;

import java.util.Scanner;

public class RightTriangle {
    private char letter;
    public RightTriangle() {
        this.letter = '*';
    }

    public RightTriangle(char letter) {
        this.letter = letter;
    }

    void printRightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(this.letter);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("어떤 문자로 만들것인지 입력하세요 : ");
        char chr = sc.next().charAt(0);

        System.out.print("몇단으로 만들것인지 입력하세요 : ");
        int n = sc.nextInt();

        RightTriangle rightTriangle = new RightTriangle(chr);

        rightTriangle.printRightTriangle(n);
    }
}
