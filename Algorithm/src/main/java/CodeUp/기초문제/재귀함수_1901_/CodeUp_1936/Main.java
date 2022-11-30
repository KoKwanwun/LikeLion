package CodeUp.기초문제.재귀함수_1901_.CodeUp_1936;

import java.util.Scanner;

public class Main {
    // a, b 중 큰 쪽을 한칸 씩 올려주고, 같다면 0리턴
    public static int goUp(int a, int b) {
        if(a > b) {
            return goUp(a / 2, b) + 1;
        } else if(a < b) {
            return goUp(a, b / 2) + 1;
        } else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(goUp(a, b));
    }
}
