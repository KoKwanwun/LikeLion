package week6_20221024_20221028.day_221025;

public class HashFunction {
    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % 1000;    // 1000개
    }

    public static void main(String[] args) {
        HashFunction hf = new HashFunction();
        System.out.println(hf.hash("TOEIC"));
    }
}
