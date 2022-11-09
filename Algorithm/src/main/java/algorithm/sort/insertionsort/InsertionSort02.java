package algorithm.sort.insertionsort;

import java.util.Arrays;

public class InsertionSort02 {
    // 재귀 활용
    void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    int[] sort(int[] arr, int i) {
        // i가 arr 길이와 같아지면 arr 리턴
        if (i == arr.length) return arr;

        for (int j = i; j > 0; j--){
            // 현재 값이 앞의 값보다 더 작다면 swap
            if(arr[j] < arr[j-1]){
                swap(arr, j, j-1);
            } else{
                break;          // 아니라면 바로 탈출하여 시간 줄임
            }
        }

        // i에 +1 해서 재귀
        return sort(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8, 5, 6, 2, 4};

        InsertionSort02 insertionSort02 = new InsertionSort02();

        int[] resultArr = insertionSort02.sort(arr, 1);

        // 배열 형태로 출력
        System.out.println(Arrays.toString(resultArr));
    }
}
