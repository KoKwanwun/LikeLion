package Programmers.Programmers_17681;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String binArr1;
        String binArr2;
        String[] answer = new String[n];
        String result;

        for (int i = 0; i < n; i++) {
            // 길이가 n인 2진수로 변환
            String binStr1 = Integer.toBinaryString(arr1[i]);
            String binStr2 = Integer.toBinaryString(arr2[i]);
            binArr1 = "0".repeat(n - binStr1.length()) + binStr1;
            binArr2 = "0".repeat(n - binStr2.length()) + binStr2;

            // 각 자리수에 1이 하나라도 있다면 #, 그외는 공백
            result = "";
            for (int j = 0; j < n; j++) {
                if(binArr1.charAt(j) == '1' || binArr2.charAt(j) == '1') {
                    result += "#";
                } else {
                    result += " ";
                }
            }
            // 결과를 배열에 넣기
            answer[i] = result;
        }
        return answer;
    }
}
