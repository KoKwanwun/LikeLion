package CodeUp.기초문제.기초100제_1001_.CodeUp_1051_1060.CodeUp_1059;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // ~ : 	비트를 1이면 0으로, 0이면 1로 반전시킴. (비트 NOT 연산, 1의 보수)
        System.out.println(~num);
    }
}
