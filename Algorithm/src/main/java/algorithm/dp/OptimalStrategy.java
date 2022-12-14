package algorithm.dp;

import java.util.Arrays;

public class OptimalStrategy {

    public static void main(String[] args) {
        int[] arr = {2, 7, 40, 19};
        Pair1[][] dp = new Pair1[arr.length][arr.length];

        // 숫자가 써있는 동전이 1개만 있는 경우
        // 2 or 7 or 40 or 19
        for (int i = 0; i < arr.length; i++) {
            //0,0 1,1 2,2 3,3
            // 내가 왼쪽
            dp[i][i] = new Pair1(arr[i], 0);
        }


    }
}
