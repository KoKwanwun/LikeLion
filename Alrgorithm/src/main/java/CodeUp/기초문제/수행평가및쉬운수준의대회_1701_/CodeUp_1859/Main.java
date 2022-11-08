package CodeUp.기초문제.수행평가및쉬운수준의대회_1701_.CodeUp_1859;

import java.util.Scanner;

public class Main {
    void printStar(int start, int size) {
        if(start == size) {
            System.out.println();
            return;
        }
        System.out.print("*");
        printStar(start + 1, size);
    }

    void printStarLine(int start, int size) {
        if(start == size) {
            return;
        }
        printStar(0, start + 1);
        printStarLine(start + 1, size);
    }

    public static void main(String[] args) {
        Main main= new Main();
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        main.printStarLine(0, size);
    }
}
