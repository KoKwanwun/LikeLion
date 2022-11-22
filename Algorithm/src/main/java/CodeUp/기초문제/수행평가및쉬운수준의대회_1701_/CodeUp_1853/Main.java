package CodeUp.기초문제.수행평가및쉬운수준의대회_1701_.CodeUp_1853;

import java.util.Scanner;

public class Main {
    public void printSum(int n, int sum){
        if(n < 1){
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n-1, sum);
    }

    public static void main(String[] args) {
        Main main= new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        main.printSum(n, 0);
    }
}
