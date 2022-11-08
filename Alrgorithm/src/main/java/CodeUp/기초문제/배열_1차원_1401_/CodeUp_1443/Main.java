package CodeUp.기초문제.배열_1차원_1401_.CodeUp_1443;

import java.util.Scanner;

public class Main {
    void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    int[] sort(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                // 현재 값이 앞의 값보다 더 작다면 swap
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                } else{
                    break;          // 아니라면 바로 for문 탈출
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 값을 입력받아 배열 만들기
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Main main = new Main();
        
        // 결과 한줄씩 출력
        int[] resultArr = main.sort(arr);
        for (int i : resultArr) {
            System.out.println(i);
        }
    }
}
