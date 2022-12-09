package CodeUp.CodeUp_2699;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        // index 초과 방지를 위해 1씩 늘려주기
        int[][] dp = new int[str2.length() + 1][str1.length() + 1];

        for (int i = 1; i < str2.length() + 1; i++) {
            for (int j = 1; j < str1.length() + 1; j++) {
                // for문에서 1부터 시작하므로 문자 비교시에는 -1씩 해주기
                // 같을 경우
                if(str2.charAt(i-1) == str1.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else{     // 다를 경우
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        System.out.println(dp[str2.length()][str1.length()]);
    }
}
