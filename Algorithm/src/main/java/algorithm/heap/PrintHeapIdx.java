package algorithm.heap;

import java.util.Scanner;

public class PrintHeapIdx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int leftIdx = (2 * n) + 1;
        int rightIdx = (2 * n) + 2;

        System.out.println(leftIdx + " " + rightIdx);
    }
}
