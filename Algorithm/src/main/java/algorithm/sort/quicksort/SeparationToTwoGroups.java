package algorithm.sort.quicksort;

import java.util.Arrays;

public class SeparationToTwoGroups {

    public int[] sort(int[] arr, int startIdx, int endIdx) {
        int pivot = arr[(startIdx + endIdx) / 2];
        int leftIdx = startIdx;
        int rightIdx = endIdx;

        // pivot을 기준으로 교환
        while(leftIdx <= rightIdx){
            while(arr[leftIdx] < pivot) leftIdx += 1;
            while(arr[rightIdx] > pivot) rightIdx -= 1;

            if(leftIdx <= rightIdx){
                int temp = arr[leftIdx];
                arr[leftIdx] = arr[rightIdx];
                arr[rightIdx] = temp;
                leftIdx += 1;
                rightIdx -= 1;
            }
        }

        // 재귀 사용
        if(startIdx < rightIdx) sort(arr, startIdx, rightIdx);
        if(leftIdx < endIdx) sort(arr, leftIdx, endIdx);

        return arr;
    }

    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        SeparationToTwoGroups st = new SeparationToTwoGroups();

        System.out.println(Arrays.toString(st.sort(arr, 0, arr.length - 1)));
    }
}
