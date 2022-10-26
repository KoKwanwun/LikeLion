package week6_20221024_20221028.day_221026;

import java.util.ArrayList;
import java.util.List;

public class HashTableFunctionImprove {
    class Node {
        private String key;
        private Integer value;

        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }
    }

    private int size = 1000;
    private List<Node>[] table = new ArrayList[1000];

    public HashTableFunctionImprove() {
    }

    public HashTableFunctionImprove(int size) {
        this.size = size;
        this.table = new ArrayList[size];
    }

    public int hash(String key) {
        int asciiSum = 0;
        for (int i = 0; i < key.length(); i++) {
            asciiSum += key.charAt(i);
        }
        return asciiSum % size;
    }

    public void insert(String key, Integer value) {
        int hashCode = hash(key);
        if(this.table[hashCode] == null){
            this.table[hashCode] = new ArrayList<>();
        }
        // Map, Object
        this.table[hashCode].add(new Node(key, value));
        System.out.println(key + " " + hashCode + "방에 저장이 완료되었습니다.");
    }

    public Integer search(String key) {
        List<Node> nodes = this.table[hash(key)];

        for (Node node : nodes) {
            if(key.equals(node.getKey())){
                return node.getValue();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        HashTableFunctionImprove ht = new HashTableFunctionImprove();
        ht.insert("Yoonseo", 1);
        ht.insert("Seoyoon", 2);

        int result = ht.search("Yoonseo");
        if(result == 1) {
            System.out.println("테스트 성공");
        } else{
            System.out.println("테스트 실패");
        }

        result = ht.search("Seoyoon");
        if(result == 2) {
            System.out.println("테스트 성공");
        } else{
            System.out.println("테스트 실패");
        }
    }
}
