package CodeUp.기초문제.기초100제_1001_.CodeUp_1061_1070.CodeUp_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num >= 90 && num <= 100){
            System.out.println("A");
        } else if (num >= 70 && num <= 89) {
            System.out.println("B");
        } else if (num >= 40 && num <= 69) {
            System.out.println("C");
        } else if (num >= 0 && num <= 39) {
            System.out.println("D");
        }
    }
}
