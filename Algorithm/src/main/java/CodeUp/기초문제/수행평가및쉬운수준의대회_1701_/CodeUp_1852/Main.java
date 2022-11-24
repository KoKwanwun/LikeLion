package CodeUp.기초문제.수행평가및쉬운수준의대회_1701_.CodeUp_1852;

import java.util.Scanner;

public class Main {
    public static void print1ToN(int n, int num) {
        if(num > n){
            return;
        }
        System.out.print(num + " ");
        print1ToN(n, num + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        print1ToN(n, 1);
    }
}
