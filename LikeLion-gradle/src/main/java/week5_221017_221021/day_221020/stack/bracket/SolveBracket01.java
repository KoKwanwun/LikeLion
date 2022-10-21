package week5_221017_221021.day_221020.stack.bracket;

public class SolveBracket01 {
    public boolean solution(String s) {
        // Stack 쓰지않고 괄호 풀기
        while(s.indexOf("()") >= 0){
            s = s.replace("()", "");
        }
        return s.length() == 0;
    }
}
