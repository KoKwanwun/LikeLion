package CodeUp.기초문제.기초100제_1001_.CodeUp_1061_1070.CodeUp_1067;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 0){
            System.out.println("minus");
        } else {
            System.out.println("plus");
        }
        if (num % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
