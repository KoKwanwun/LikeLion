package algorithm.drawStar;

import java.util.Scanner;

public class SquareStar {
    void printSquare(int n){
        for (int i = 0; i < n; i++) {
            System.out.println("*".repeat(n));
        }
    }

    public static void main(String[] args) {
        SquareStar squareStar = new SquareStar();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        squareStar.printSquare(size);
    }
}