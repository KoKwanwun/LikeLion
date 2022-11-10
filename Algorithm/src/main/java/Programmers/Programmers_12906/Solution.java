package Programmers.Programmers_12906;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    // Stack 사용
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(stack.peek() == arr[i]){
                continue;
            } else{
                stack.push(arr[i]);
            }
        }

        int[] answer = new int[stack.size()];
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }

    // Stack 사용 X
    public int[] solutionNoStack(int []arr) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if(nums.get(nums.size()-1) == arr[i]){
                continue;
            } else{
                nums.add(arr[i]);
            }
        }

        int[] answer = new int[nums.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = nums.get(i);
        }

        return answer;
    }
}
