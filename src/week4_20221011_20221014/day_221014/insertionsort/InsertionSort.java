package week4_20221011_20221014.day_221014.insertionsort;

import week4_20221011_20221014.day_221012.Main;

import java.util.Arrays;

public class InsertionSort {
    int[] sort(int[] arr) {
        int key;
        int tmp;



        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8, 5, 6, 2, 4};

        InsertionSort insertionSort = new InsertionSort();

        int[] resultArr = insertionSort.sort(arr);
        System.out.println(Arrays.toString(resultArr));
    }
}
