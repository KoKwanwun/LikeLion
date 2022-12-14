package algorithm.dp;

import java.util.Arrays;

public class LeftAndRight {
    public static void main(String[] args) {
        int[] arr = {2, 7, 40, 19};
        Pair1[][] dp = new Pair1[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            dp[i][i] = new Pair1(arr[i], arr[i]);
        }

        for (int k = 1; k < dp.length; k++) {
            int i = 0;

            for (int j = k; j < dp.length; j++) {
                dp[i][j] = new Pair1(dp[i][j-1].getLeft(), dp[i+1][j].getRight());
                i++;
            }
        }

        System.out.println(Arrays.deepToString(dp));
    }
}
