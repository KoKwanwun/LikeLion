package likelion.stack.bracket;

public class SolveBracket01 {
    public boolean solution(String s) {
        // Stack 쓰지않고 괄호 풀기
        while(s.indexOf("()") >= 0){
            s = s.replace("()", "");
        }
        return s.length() == 0;
    }

    public boolean solution1(String s) {
        // Stack 쓰지않고 괄호 풀기
        while(s.indexOf("()") >= 0){
            String[] splitted = s.split("\\(\\)");
            s = String.join("", splitted);
        }

        return s.length() == 0;
    }
}
