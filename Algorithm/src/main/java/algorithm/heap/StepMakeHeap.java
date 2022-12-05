package algorithm.heap;

import java.util.Arrays;

public class StepMakeHeap {
    private static int[] makeHeap(int[] arr, int parentIdx) {
        int leftIdx = parentIdx * 2 + 1;
        int rightIdx = parentIdx * 2 + 2;
        int greatIdx = parentIdx;
        int tmp;

        if(leftIdx < arr.length && arr[leftIdx] > arr[greatIdx]){
            tmp = arr[leftIdx];
            arr[leftIdx] = arr[greatIdx];
            arr[greatIdx] = tmp;
        }

        if(rightIdx < arr.length && arr[rightIdx] > arr[greatIdx]){
            tmp = arr[rightIdx];
            arr[rightIdx] = arr[greatIdx];
            arr[greatIdx] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8};

        arr = makeHeap(arr, 1);
        System.out.println(Arrays.toString(arr));

        arr = makeHeap(arr, 0);
        System.out.println(Arrays.toString(arr));
    }
}
