package week3_221004_221007.day_221006.MapTest;

import java.util.HashMap;

public class PrintAlphabet {
    public static void main(String[] args) {
        IsAlphabet isAlphabet = new IsAlphabet();

        String s1 = "aabbccddefghijkkkkkl///:lmABCDzywps";
        s1 = s1.toUpperCase();
        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for(char c = 'A'; c<= 'Z'; c++){
            alphabetMap.put(c, 0);
        }

        // String을 한글자씩 출력
        for(int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);

            if(isAlphabet.checkIsAlphabet(c)){
                alphabetMap.put(c, alphabetMap.get(c) + 1);
            }
        }

        System.out.println(alphabetMap);
    }
}
