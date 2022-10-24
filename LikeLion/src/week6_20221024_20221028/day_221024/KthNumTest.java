package week6_20221024_20221028.day_221024;

import java.util.Arrays;

public class KthNumTest {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[] arr1 = Arrays.copyOfRange(arr, 2, 5);
        System.out.println(Arrays.toString(arr1));
    }
}
