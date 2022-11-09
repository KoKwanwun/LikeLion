package algorithm.sort.selectionsort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        int minIdx;
        int tmp;

        for (int i = 0; i < nums.length; i++) {
            minIdx = i;
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j] < nums[minIdx]){
                    minIdx = j;
                }
            }
            tmp = nums[minIdx];
            nums[minIdx] = nums[i];
            nums[i] = tmp;
        }

        System.out.println(Arrays.toString(nums));
    }
}
