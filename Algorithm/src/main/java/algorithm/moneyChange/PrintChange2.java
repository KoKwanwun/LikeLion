package algorithm.moneyChange;

import java.util.Scanner;

public class PrintChange2 {
    public static void main(String[] args) {
        System.out.print("금액을 넣으세요:");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        int money50000 = 50000;
        int money10000 = 10000;
        int money5000 = 5000;
        int money1000 = 1000;
        int money500 = 500;
        int money100 = 100;
        int money50 = 50;
        int money10 = 10;

        System.out.print(money50000 + "원? " + (money / money50000) + "개, ");
        money %= money50000;
        System.out.println("나머지 : " + money + "원");

        System.out.print(money10000 + "원? " + (money / money10000) + "개, ");
        money %= money10000;
        System.out.println("나머지 : " + money + "원");

        System.out.print(money5000 + "원? " + (money / money5000) + "개, ");
        money %= money5000;
        System.out.println("나머지 : " + money + "원");

        System.out.print(money1000 + "원? " + (money / money1000) + "개, ");
        money %= money1000;
        System.out.println("나머지 : " + money + "원");

        System.out.print(money500 + "원? " + (money / money500) + "개, ");
        money %= money500;
        System.out.println("나머지 : " + money + "원");

        System.out.print(money100 + "원? " + (money / money100) + "개, ");
        money %= money100;
        System.out.println("나머지 : " + money + "원");

        System.out.print(money50 + "원? " + (money / money50) + "개, ");
        money %= money50;
        System.out.println("나머지 : " + money + "원");

        System.out.print(money10 + "원? " + (money / money10) + "개, ");
        money %= money10;
        System.out.println("나머지 : " + money + "원");
    }
}
