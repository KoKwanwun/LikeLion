package week7_20221031_20221103.day_221103;

import java.util.ArrayList;
import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int N = 50;
        int[] nums = new int[N-1];      // 2~50까지 넣을 배열 생성
        boolean[] checks = new boolean[nums.length];
        Arrays.fill(checks, true);  // checks를 true로 초기화
        for (int i = 0; i < nums.length; i++) { // 2~50까지 채우기
            nums[i] = i + 2;
        }

        // 2를 제외한 2의 배수 지우기
        // 0 1 2 3 4 5 6 7 8  .. 48
        // 2 3 4 5 6 7 8 9 10 ... 50
        for (int i = 2; i < nums.length; i+=2) {
            checks[i] = false;
        }

        // check를 참고해서 true인 nums[i]만 출력
        for (int i = 0; i < nums.length; i++) {
            if(checks[i]){
                System.out.println(nums[i]);
            }
        }
    }
}
