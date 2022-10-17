package week3_221004_221007.day_221004;

import java.util.Scanner;

public class PrintChange {
    public static void main(String[] args) {
        int[] arrs = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        System.out.print("금액을 넣으세요:");
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int tmp;

        for(int arr : arrs) {
            tmp = money / arr;
            money %= arr;
            System.out.println(arr + "원? " + tmp + "개");
        }
    }
}
