package CodeUp.기초문제.수행평가및쉬운수준의대회_1701_.CodeUp_1855;

import java.util.Scanner;

public class Main {
    public int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void main(String[] args) {
        Main main= new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(main.fibonacci(n));
    }
}

