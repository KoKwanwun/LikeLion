package week4_20221011_20221014.day_221014.insertionsort;

import java.util.Arrays;

public class InsertionSort {
    int[] sort(int[] arr) {
        int tmp;

        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                if(arr[j] < arr[j-1]){
                    tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                } else{
                    break;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8, 5, 6, 2, 4};

        InsertionSort insertionSort = new InsertionSort();

        int[] resultArr = insertionSort.sort(arr);
        System.out.println(Arrays.toString(resultArr));
    }
}
