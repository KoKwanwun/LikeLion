package algorithm.dp;

public class Fibonacci {

    private static int fibonacci(int n) {
        int[] arr = new int[n + 1];

        for (int i = 0; i < (n + 1); i++) {
            // 0, 1번째 값은 1로 고정
            if(i < 2){
                arr[i] = 1;
                continue;
            }

            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
