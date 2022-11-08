package CodeUp.기초문제.다중반복문_1351_.CodeUp_1356;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) {
            if (i == 1 || i == size){
                for (int j = 1; j <= size; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.print("*");
                for (int j = 2; j < size; j++) {
                    System.out.print(" ");
                }
                System.out.print("*\n");
            }
        }
    }
}
