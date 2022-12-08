package algorithm.lcs;

import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        String str1 = "ABCDCBA";
        String str2 = "DCABDC";

        int[][] arr = new int[str2.length()][str1.length()];

        System.out.println(Arrays.deepToString(arr));
    }
}
