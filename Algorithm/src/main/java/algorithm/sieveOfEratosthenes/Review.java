package algorithm.sieveOfEratosthenes;

public class Review {
    public static void main(String[] args) {
        int size = 50;
        int[] nums = new int[size-1];
        boolean[] checks = new boolean[size-1];
        int multipleOf;

        // nums(2~50), check(true) 넣기
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 2;
            checks[i] = true;
        }

        // 본인을 제외한 배수에 false 넣기
        for (int i = 0; i < nums.length; i++) {
            multipleOf = nums[i];
            for (int j = multipleOf + i; j < nums.length; j+=multipleOf) {
                checks[j] = false;
            }
        }

        // 소수 출력
        for (int i = 0; i < nums.length; i++) {
            if(checks[i]){
                System.out.print(nums[i] + " ");
            }
        }
    }
}
