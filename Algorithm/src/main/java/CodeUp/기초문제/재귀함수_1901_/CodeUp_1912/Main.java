package CodeUp.기초문제.재귀함수_1901_.CodeUp_1912;

import java.util.Scanner;

public class Main {
    public int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Main main= new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(main.factorial(n));
    }
}
