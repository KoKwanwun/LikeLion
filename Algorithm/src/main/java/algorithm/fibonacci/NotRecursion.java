package algorithm.fibonacci;

import java.util.Scanner;

public class NotRecursion {
    public static void main(String[] args) {
        // 값 입력받기
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // n크기 배열 생성
        int[] arr = new int[n];

        // i가 0 또는 1인 경우, 1을 넣고 나머지는 피보나치 공식 적용
        for (int i = 0; i < n; i++) {
            if(i == 0 || i == 1){
                arr[i] = 1;
            } else{
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        // 마지막 값 출력
        System.out.println(arr[n-1]);
    }
}