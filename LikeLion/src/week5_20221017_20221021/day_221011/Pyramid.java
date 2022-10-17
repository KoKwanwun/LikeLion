package week5_20221017_20221021.day_221011;

import java.util.Scanner;

public class Pyramid {
    void printPyramid(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++) {
                if(j % 2 == 0){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Pyramid pyramid = new Pyramid();

        pyramid.printPyramid(n);
    }
}
