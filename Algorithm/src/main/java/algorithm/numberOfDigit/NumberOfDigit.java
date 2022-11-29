package algorithm.numberOfDigit;

import java.util.Arrays;

public class NumberOfDigit {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 8, 18, 13, 1, 7, 16, 7, 0, 14};
        int[] digit = new int[arr.length];

        // Log를 활용하여 자리 수 구하기
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                digit[i] = 1;
                continue;
            }
            digit[i] = (int) (Math.log10(arr[i]) + 1);
        }
        System.out.println(Arrays.toString(digit));

        // stream의 distinct를 활용하여 중복제거
        digit = Arrays.stream(digit).distinct().toArray();

        // 오름차순 정렬
        Arrays.sort(digit);
        System.out.println(Arrays.toString(digit));
    }
}
