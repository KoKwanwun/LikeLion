package CodeUp.CodeUp_2623;

import java.util.Scanner;

public class GcdNoRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer;

        while(true) {
            if(a == b | a == 1 | b == 1){
                answer = a;
                break;
            } else if(a > b){
                a = a - b;
            } else{
                b = b - a;
            }
        }
        System.out.println(answer);
    }
}
