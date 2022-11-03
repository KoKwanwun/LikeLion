package week7_20221031_20221103.day_221103;

import java.util.ArrayList;
import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void printNum(int[] nums, boolean[] checks) {
        // check를 참고해서 true인 nums[i]만 출력, size 출력
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if(checks[i]){
                System.out.print(nums[i] + " ");
                cnt++;
            }
        }
        System.out.println("\nsize:" + cnt);
    }

    public static void main(String[] args) {
        int N = 50;
        int[] nums = new int[N-1];      // 2~50까지 넣을 배열 생성
        boolean[] checks = new boolean[nums.length];
        Arrays.fill(checks, true);  // checks를 true로 초기화
        for (int i = 0; i < nums.length; i++) { // 2~50까지 채우기
            nums[i] = i + 2;
        }

        // 배수를 false로 변환
        for (int i = 0; i * i <= N; i++) {
            int multipleOf = nums[i];

            for (int j = multipleOf + i; j < nums.length; j+=multipleOf) {
                checks[j] = false;
            }

            printNum(nums, checks);
        }
    }
}
