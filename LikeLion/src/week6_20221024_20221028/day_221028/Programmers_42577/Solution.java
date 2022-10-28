package week6_20221024_20221028.day_221028.Programmers_42577;

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        // 정렬하여 인덱스 차이가 1인 것끼리만 비교 가능
        Arrays.sort(phone_book);

        // starsWith : phone_book[i]가 phone_book[i-1]로 시작하는지 확인
        for (int i = 1; i < phone_book.length; i++) {
            if(phone_book[i].startsWith(phone_book[i-1])){
                return false;
            }
        }
        return true;
    }
}
