package Programmers.Programmers_12916;

class Solution {
    boolean solution(String s) {
        // 소문자로 통일
        s = s.toLowerCase();

        // 각 개수 구하기
        int cntY = s.length() - s.replace("y", "").length();
        int cntP = s.length() - s.replace("p", "").length();

        return cntP == cntY;
    }
}
