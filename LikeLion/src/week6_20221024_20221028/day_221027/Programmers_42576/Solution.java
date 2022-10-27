package week6_20221024_20221028.day_221027.Programmers_42576;

class Solution {
    public int size = 1000000;
    public String table = new String[1000000];

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }

    public int insert(String key, int sumHashCode) {
        int hashCode = hash(key);

        this.table[hashCode] = key;

        return sumHashCode + hashCode;
    }

    public int search(String key, int sumHashCode) {
        int hashCode = hash(key);

        return sumHashCode - hashCode;
    }

    public String solution(String[] participant, String[] completion) {
        Solution s = new Solution();
        int sumHashCode = 0;

        for (String each : participant) {
            sumHashCode = s.insert(each, sumHashCode);
        }

        for (String each : completion) {
            sumHashCode = s.search(each, sumHashCode);
        }

        return table[sumHashCode];
    }
}
