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
    }
}
