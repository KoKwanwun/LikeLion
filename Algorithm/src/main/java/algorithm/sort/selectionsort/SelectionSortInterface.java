package algorithm.sort.selectionsort;

import java.util.Arrays;

interface StatementStrategy {
    boolean apply(int a, int b);
}

public class SelectionSortInterface {
    public int[] selectionSort(int[] arr, StatementStrategy stmt) {
        for (int i = 0; i < arr.length; i++) {
            int targetIdx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(stmt.apply(arr[targetIdx], arr[j])) targetIdx = j;
            }
            int temp = arr[i];
            arr[i] = arr[targetIdx];
            arr[targetIdx] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        SelectionSortInterface ss = new SelectionSortInterface();
        int[] ascArr = ss.selectionSort(nums, (a, b) -> a > b);
        System.out.println(Arrays.toString(ascArr));

        int[] descArr = ss.selectionSort(nums, (a, b) -> a < b);
        System.out.println(Arrays.toString(descArr));
    }
}
