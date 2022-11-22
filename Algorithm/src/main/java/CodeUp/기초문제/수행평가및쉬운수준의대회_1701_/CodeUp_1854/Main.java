package CodeUp.기초문제.수행평가및쉬운수준의대회_1701_.CodeUp_1854;

import java.util.Scanner;

public class Main {
    public void digitSum(long n, int sum){
        if(n <= 0){
            System.out.println(sum);
            return;
        }
        sum += n % 10;
        digitSum(n / 10, sum);
    }

    public static void main(String[] args) {
        Main main= new Main();
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        main.digitSum(n, 0);
    }
}