package CodeUp.기초문제.기초100제_1001_.CodeUp_1071_1080.CodeUp_1080;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int targetNum = sc.nextInt();
        int n = 1;
        int sum = 0;

        while (true){
            sum += n;

            if (sum >= targetNum){
                break;
            }
            n++;
        }
        System.out.println(n);
    }
}
