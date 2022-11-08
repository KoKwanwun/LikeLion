package algorithm.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int targetNum = 7;
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        int startIdx = 0;
        int endIdx = nums.length - 1;
        int midIdx;
        int targetIdx = -1;

        while(startIdx <= endIdx){
            midIdx = (startIdx + endIdx) / 2;

            if (nums[midIdx] < targetNum) {
                startIdx = midIdx + 1;
            } else if (nums[midIdx] > targetNum) {
                endIdx = midIdx - 1;
            } else {
                System.out.println(midIdx);
                targetIdx = midIdx;
                break;
            }
        }

        if (targetIdx == -1) {
            System.out.println(targetIdx);
        }
    }
}
