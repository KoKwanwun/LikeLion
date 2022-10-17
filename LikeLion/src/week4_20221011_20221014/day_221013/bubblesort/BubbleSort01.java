package week4_20221011_20221014.day_221013.bubblesort;

import java.util.Arrays;

public class BubbleSort01 {
    int[] sort(int[] arr) {
        int temp;

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    // swap
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        // 오름차순 또는 내림차순으로 정렬하는 알고리즘을 짜보세요.
        BubbleSort01 bubbleSort01 = new BubbleSort01();
        int[] resultArr = bubbleSort01.sort(arr);

        System.out.println(Arrays.toString(resultArr));
    }
}
