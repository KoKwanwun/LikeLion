package algorithm.heap;

import java.util.Arrays;

public class HeapSort {
    private static int[] makeHeap(int[] arr, int parentIdx, int arrSize) {
        int leftIdx = parentIdx * 2 + 1;
        int rightIdx = parentIdx * 2 + 2;
        int greatIdx = parentIdx;

        if(leftIdx < arrSize && arr[leftIdx] > arr[greatIdx]){
            greatIdx = leftIdx;
        }

        if(rightIdx < arrSize && arr[rightIdx] > arr[greatIdx]){
            greatIdx = rightIdx;
        }

        if(greatIdx != parentIdx) {
            int tmp = arr[greatIdx];
            arr[greatIdx] = arr[parentIdx];
            arr[parentIdx] = tmp;
            makeHeap(arr, greatIdx, arrSize);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8};
        arr = new int[]{5, 8, 4, 7, 3, 2, 9, 10, 11};

        System.out.println("Heap");
        for (int i = (arr.length - 2) / 2; i >= 0; i--) {
            arr = makeHeap(arr, i, arr.length);
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("Sort");
        for (int i = arr.length - 1; i > 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            arr = makeHeap(arr, 0, i);
            System.out.println(Arrays.toString(arr));
        }
    }
}
