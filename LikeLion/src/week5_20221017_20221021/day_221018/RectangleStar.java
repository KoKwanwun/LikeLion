package week5_20221017_20221021.day_221018;

import java.util.Scanner;

public class RectangleStar {
    void printRectangle(int x, int y){
        for (int i = 0; i < y; i++) {
            System.out.println("*".repeat(x));
        }
    }

    public static void main(String[] args) {
        RectangleStar rectangleStar = new RectangleStar();
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        rectangleStar.printRectangle(x, y);
    }
}
