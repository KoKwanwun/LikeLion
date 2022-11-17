package algorithm.sort.quicksort;

import java.util.Arrays;

public class SeparationToTwoGroups {

    public int[] sort(int[] arr, int startIdx, int endIdx) {
        int pivot = arr[arr.length / 2];
        int leftIdx = 0;
        int rightIdx = arr.length - 1;

        while(true) {
            while (arr[leftIdx] < pivot) leftIdx += 1;
            while (arr[rightIdx] > pivot) rightIdx += 1;

            if(leftIdx > rightIdx) {
                break;
            }else {
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
                leftIdx += 1;
                rightIdx -= 1;
            }
        }
        
        return arr;
    }

    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        SeparationToTwoGroups st = new SeparationToTwoGroups();

        System.out.println(Arrays.toString(st.sort(arr, 0, arr.length)));
    }
}
