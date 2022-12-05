package algorithm.heap;

import java.util.Scanner;

public class PrintHeapIdx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(((2*n)+1) + " " + ((2*n)+2));
    }
}
