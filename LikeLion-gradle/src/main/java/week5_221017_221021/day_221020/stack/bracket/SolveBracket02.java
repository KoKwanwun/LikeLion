package week5_221017_221021.day_221020.stack.bracket;

import java.util.EmptyStackException;

public class SolveBracket02 {
    // Stack으로 괄호 풀기
    private String[] arr = new String[100000];
    private int top = 0;

    public void push(String value) {
        this.arr[this.top] = value;
        this.top++;
    }

    public String pop() {
        this.top--;
        return this.arr[this.top];
    }

    public boolean isEmpty() {
        return this.top == 0 ? true : false;
    }

    public String peek() {
        if(isEmpty()) throw new EmptyStackException();
        return this.arr[this.top - 1];
    }

    boolean solution(String s) {
        SolveBracket02 solution = new SolveBracket02();
        String[] strs = s.split("");

        for (int i = 0; i < strs.length; i++) {
            if(isEmpty()){
                if(strs[i].equals("("))
                    push(strs[i]);
                else
                    return false;
            } else{
                String topValue = peek();
                if(topValue.equals("(") && strs[i].equals(")"))
                    pop();
                else
                    push(strs[i]);
            }
        }
        return isEmpty();
    }
}
