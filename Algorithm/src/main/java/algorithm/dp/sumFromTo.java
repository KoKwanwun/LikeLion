package algorithm.dp;

import java.util.Arrays;

public class sumFromTo {
    public static void main(String[] args) {
        // From부터 To까지 더하기
        int[] arr = {2, 7, 40, 19};
        int[][] sumDp = new int[arr.length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(i == j){
                    sumDp[i][j] = arr[j];
                    continue;
                }
                sumDp[i][j] = sumDp[i][j-1] + arr[j];
            }
        }

        System.out.println(Arrays.deepToString(sumDp));
    }
}
