package algorithm.sort.radixsort;

import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 4, 5, 9, 1, 0};

        // 크기가 10인 배열 만들고 -1로 채우기(arr의 원소가 0이상이라는 조건)
        int[] radixArr = new int[10];
        Arrays.fill(radixArr, -1);

        // arr의 인덱스에 해당하도록 값 넣기
        for (int i : arr) {
            radixArr[i] = i;
        }
        System.out.println(Arrays.toString(radixArr));

        // -1이 아닌 값을 arr에 다시 넣기
        int idx = 0;
        for (int i = 0; i < radixArr.length; i++) {
            if(radixArr[i] != -1){
                arr[idx++] = radixArr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
