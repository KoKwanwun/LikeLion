package week6_20221024_20221028.day_221028.Programmers_42577;

import java.util.Arrays;

class Solution {
    public boolean solution(String[] phone_book) {
        /*
         정렬하여 인덱스 차이가 1인 것끼리만 비교 가능
         문자열 정렬이기 때문에 아래와 같이 정렬됨 (오름차순이 아닌 첫째자리부터 더 작은 수가 오는 것이 앞에)
         ["119", "97674223", "1195524421"] -> ["119", "1195524421", "97674223"]
         ["12","123","1235","567","88"] -> ["12","123","1235","567","88"]
        */
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
