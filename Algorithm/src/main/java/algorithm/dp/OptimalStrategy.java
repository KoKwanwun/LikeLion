package algorithm.dp;

import java.util.Arrays;

class Pair1 {
    int left;
    int right;

    public Pair1(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Pair1{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}

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

        // From부터 To까지 더하기
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
