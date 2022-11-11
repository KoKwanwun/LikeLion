package Programmers.Programmers_17681;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String orBit;
        String binStr;
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // 길이가 n인 2진수로 변환
            orBit = Integer.toBinaryString(arr1[i] | arr2[i]);
            binStr = "0".repeat(n - orBit.length()) + orBit;

            // replaceAll로 #과 공백으로 변환
            binStr = binStr.replaceAll("1", "#");
            binStr = binStr.replaceAll("0", " ");

            // 결과를 배열에 넣기
            answer[i] = binStr;
        }
        return answer;
    }
}
