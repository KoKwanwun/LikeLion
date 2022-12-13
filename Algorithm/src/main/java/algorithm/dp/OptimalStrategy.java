package algorithm.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
    static int maxLeft(Pair1 pair1, Pair1 pair2) {
        int n = pair1.getLeft();
        int m = pair2.getLeft();

        if(n > m){
            return n;
        } else{
            return m;
        }
    }

    static int minLeft(Pair1 pair1, Pair1 pair2) {
        int n = pair1.getLeft();
        int m = pair2.getLeft();

        if(n > m){
            return m;
        } else{
            return n;
        }
    }

    static int mode(Pair1 pair1, Pair1 pair2) {
        List<Integer> list = new ArrayList<>();
        list.add(pair1.getLeft());
        list.add(pair1.getRight());
        list.add(pair2.getLeft());
        list.add(pair2.getRight());

        for (int i = 0; i < 4; i++) {
            int num = list.get(i);

            for (int j = i + 1; j < 4; j++) {
                if(num == list.get(j)){
                    return num;
                }
            }
        }

        return 0;
    }

    static int sum(Pair1 pair1, Pair1 pair2, int mode) {
        int sum = 0;

        sum += pair1.getLeft();
        sum += pair1.getRight();
        sum += pair2.getLeft();
        sum += pair2.getRight();

        sum -= (mode * 2);

        return sum;
    }

    public static void main(String[] args) {
        Pair1[][] dp = new Pair1[4][4];
        int[] arr = {2, 7, 40, 19};

        for (int i = 0; i < dp.length; i++) {
            for (int j = i; j < i + 1; j++) {
                dp[i][j] = new Pair1(arr[i], 0);
            }
        }

        for (int i = 1; i < dp.length; i++) {
            int j = 0;

            for (int k = i; k < dp.length; k++) {
                System.out.println(i + " " + j + " " + k);

                int max = maxLeft(dp[j+1][k], dp[j][k-1]);
                int min = minLeft(dp[j+1][k], dp[j][k-1]);
                int mode = mode(dp[j+1][k], dp[j][k-1]);
                int sum = sum(dp[j+1][k], dp[j][k-1], mode);

                if(i % 2 == 1) {
                    dp[j][k] = new Pair1(max, min);
                } else{
                    dp[j][k] = new Pair1(sum, mode);
                }

                System.out.println(dp[j][k]);

                j++;
            }
        }

        System.out.println(Arrays.deepToString(dp));
    }
}
