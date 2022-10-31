package week7_20221031_20221103.day_221031.Programmers_42840;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] correctValue = {0, 0, 0};

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == person1[i % person1.length]){
                correctValue[0]++;
            }
            if(answers[i] == person2[i % person2.length]){
                correctValue[1]++;
            }
            if(answers[i] == person3[i % person3.length]){
                correctValue[2]++;
            }
        }

        int maxValue = -1;

        for (int i = 0; i < 3; i++) {
            if(maxValue < correctValue[i])  maxValue = correctValue[i];
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if(maxValue == correctValue[i]){
                list.add(i+1);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
