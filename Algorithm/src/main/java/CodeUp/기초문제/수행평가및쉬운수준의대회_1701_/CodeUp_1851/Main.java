package CodeUp.기초문제.수행평가및쉬운수준의대회_1701_.CodeUp_1851;

import java.util.Scanner;

public class Main {
    public void printStar(int n){
        if(n < 1){
            return;
        }
        System.out.print("*");
        printStar(n-1);
    }

    public static void main(String[] args) {
        Main main= new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        main.printStar(n);
    }
}
