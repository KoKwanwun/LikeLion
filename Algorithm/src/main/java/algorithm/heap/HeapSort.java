package algorithm.heap;

import java.util.Arrays;

public class HeapSort {
    public static int[] swap(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;

        return arr;
    }

    // 부모노드가 자식보다 항상 크거나 항상 작은 이진트리
    public static void main(String[] args) {
        int[] arr = new int[]{9, 8, 5, 7, 3, 2, 4, 10, 11};

        for (int i = arr.length-1; i > 0; i--) {
            if(i <= 2 & arr[i] > arr[0]){
                swap(arr, i, 0);
            }else if(i % 2 == 0 & arr[i] > arr[(i-2)/2]){
                swap(arr, i, (i-2)/2);
            }else if(i % 2 == 1 & arr[i] > arr[(i-1)/2]){
                swap(arr, i, (i-1)/2);
            }

            System.out.println(Arrays.toString(arr));
        }
    }
}
