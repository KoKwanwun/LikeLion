package algorithm.heap;

import java.util.Arrays;

public class HeapSort {
    private static int[] makeHeap(int[] arr, int parentIdx) {
        int leftIdx = parentIdx * 2 + 1;
        int rightIdx = parentIdx * 2 + 2;
        int greatIdx = parentIdx;

        if(leftIdx < arr.length && arr[leftIdx] > arr[greatIdx]){
            greatIdx = leftIdx;
        }

        if(rightIdx < arr.length && arr[rightIdx] > arr[greatIdx]){
            greatIdx = rightIdx;
        }

        if(greatIdx != parentIdx) {
            int tmp = arr[greatIdx];
            arr[greatIdx] = arr[parentIdx];
            arr[parentIdx] = tmp;
            makeHeap(arr, greatIdx);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8};
        arr = new int[]{5, 8, 4, 7, 3, 2, 9, 10, 11};

        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            arr = makeHeap(arr, i);
            System.out.println(Arrays.toString(arr));
        }
    }
}
