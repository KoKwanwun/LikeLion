package CodeUp.기초문제.다중반복문_1351_.CodeUp_1367;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
