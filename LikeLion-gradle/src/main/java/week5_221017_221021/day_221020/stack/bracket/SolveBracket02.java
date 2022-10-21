package week5_221017_221021.day_221020.stack.bracket;

import java.util.Stack;

public class SolveBracket02 {
    // Stack으로 괄호 풀기
    private Stack<Character> stack = new Stack<>();

    boolean solution(String s) {
        SolveBracket02 solution = new SolveBracket02();

        for (int i = 0; i < s.length(); i++) {
            if('(' == s.charAt(i)){
                stack.push(s.charAt(i));
            } else if (')' == s.charAt(i)) {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
