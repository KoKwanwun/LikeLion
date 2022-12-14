package algorithm.dp;

import java.util.Arrays;

public class OptimalStrategy {

    public static void main(String[] args) {
        int[] coins = {2, 7, 40, 19};
        Pair1[][] dp = new Pair1[coins.length][coins.length];

        // 숫자가 써있는 동전이 1개만 있는 경우
        // 2 or 7 or 40 or 19
        for (int i = 0; i < coins.length; i++) {
            //0,0 1,1 2,2 3,3
            // 내가 왼쪽
            dp[i][i] = new Pair1(coins[i], 0);
        }

        // 나머지 채우기
        for (int i = 1; i < coins.length; i++) {
            for (int j = 0; j < coins.length - i; j++) {
                int coinLeft = coins[j];
                int coinRight = coins[j+i];
                // i = 2, j = 0 --> i가 행의 의미가 아니라 거리의 의미로 쓰임
                // [2, 7, 40]
                //내가 40(right)을 선택하면 상대방이 2, 7중에 최적 선택을 하는 경우와 같습니다.
                // 그러므로 왼쪽칸 7, 2의 두번재 값을 내가 가지고 와야 합니다. 그래서 40+2 = 42가 됩니다.
                // j가 0일때 왼쪽칸은? dp[j][j+i-1] --> dp[0][1]
                int x = coinRight + dp[j][j+i-1].right;

                // dp[0][1] 0, 2
                //         dp[1][2]

                //내가 2(left)를 선택하면 상대방이 40, 7중에 최적 선택을 하는 경우와 같습니다.
                // 그러므로 아래칸 40, 7의 두번재 값을 내가 가지고 와야 합니다. 그래서 2 + 7 = 9가 됩니다.
                // j가 0일때 아래칸은? dp[j+1][j+i] --> dp[1][2]
                int y = coinLeft + dp[j+1][j+i].right;

                // 상대방은 왼쪽과 아래칸의 왼쪽 값 중 작은 값이 상대방의 최적이 됩니다.
                int second = Math.min(dp[j+1][j+i].left, dp[j][j+i-1].left);

                // 나는 앞에서 구한 x, y중 큰 값이 최적 값이 됩니다.
                dp[j][j+i] = new Pair1(Math.max(x, y), second);
            }
        }
        System.out.println(Arrays.deepToString(dp));
    }
}
