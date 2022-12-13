package algorithm.dp;

import java.util.Arrays;

class Pair1 {
    int left;
    int right;

    public Pair1(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
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
        Pair1[][] dp = new Pair1[4][4];
        int[] arr = {2, 7, 40, 19};

        for (int i = 0; i < dp.length; i++) {
            for (int j = i; j < i + 1; j++) {
                dp[i][j] = new Pair1(arr[i], 0);
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = i + 1; j < dp[0].length; j++) {
                int n = dp[i+1][j].getLeft();
                int m = dp[i][j-1].getLeft();

                int sum = dp[i+1][j].getRight() + dp[i][j-1].getRight();
                int max;
                int min;

                if(n > m){
                    max = n;
                    min = m;
                } else{
                    max = m;
                    min = n;
                }

                if(j % 2 == 1) {
                    dp[i][j] = new Pair1(max, min);
                } else{
                    dp[i][j] = new Pair1(max, sum);
                }
                System.out.println(dp[i][j]);
            }
        }

        System.out.println(Arrays.deepToString(dp));

    }
}
