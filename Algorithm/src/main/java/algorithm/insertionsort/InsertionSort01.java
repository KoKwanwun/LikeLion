package algorithm.insertionsort;

import java.util.Arrays;

public class InsertionSort01 {
    void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                // 현재 값이 앞의 값보다 더 작다면 swap
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else{
                    break;          // 아니라면 바로 탈출하여 시간 줄임
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8, 5, 6, 2, 4};

        InsertionSort01 insertionSort01 = new InsertionSort01();

        int[] resultArr = insertionSort01.sort(arr);

        // 배열 형태로 출력
        System.out.println(Arrays.toString(resultArr));
    }
}