package Programmers.Programmers_42839;

class Solution {
    public static final String nums = "013";

    private static void numComb(int digitNum, String str) {
        if(digitNum <= 0){
            System.out.println(str);
            return;
        }
        for (int i = 0; i < nums.length(); i++) {
            System.out.println(str);
            numComb(digitNum - 1, str + nums.charAt(i));
        }
    }

    public static void main(String[] args) {
        numComb(3, "");
    }
}
