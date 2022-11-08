package algorithm.binarySearch;

import java.util.Arrays;

public class BinarySearch {
    public int searchNum(int[] nums, int findNum) {
        int idx;
        int median;

        // 중간값 찾기
        idx = nums.length / 2;
        median = nums[idx];

        // 인덱스(시작점, 끝점) 옮기기

        // 같은지 비교하기
        if(median == findNum){
            return idx;
        } else if(median > findNum) {
            return searchNum(Arrays.copyOfRange(nums, 0, idx-1), findNum);
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int idx;
        int median;

        // 중간값 찾기
        idx = nums.length / 2;
        median = nums[idx];

        // 인덱스(시작점, 끝점) 옮기기

        // 같은지 비교하기
    }
}
