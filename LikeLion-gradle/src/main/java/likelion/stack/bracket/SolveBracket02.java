package likelion.stack.bracket;

import java.util.Stack;

public class SolveBracket02 {
    // Stack으로 괄호 풀기
    private Stack<Character> stack = new Stack<>();

    boolean solution(String s) {
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
