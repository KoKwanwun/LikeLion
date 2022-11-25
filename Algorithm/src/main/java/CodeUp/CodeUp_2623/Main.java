package CodeUp.CodeUp_2623;

import java.util.Scanner;

public class Main {
    private static int gcd(int a, int b) {
        if(a == b){
            return a;
        } else if(a > b){
            return gcd(a - b, b);
        } else{
            return gcd(a, b - a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a, b));
    }
}
