package Programmers.Programmers_12926;

class Solution {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) + n;

            // 대문자, 소문자, 공백에 따라 다르게
            // 내부에서는 아스키코드가 넘어가지 않도록 순환 처리(n의 범위가 1~25이기 떄문에 %안씀)
            if(Character.isUpperCase(s.charAt(i))){
                if(temp > 90) {
                    answer += (char) (temp - 26);
                } else{
                    answer += (char) temp;
                }
            } else if(Character.isLowerCase(s.charAt(i))){
                if(temp > 122) {
                    answer += (char) (temp - 26);
                } else{
                    answer += (char) temp;
                }
            } else {
                answer += " ";
            }
        }

        return answer;
    }
}
