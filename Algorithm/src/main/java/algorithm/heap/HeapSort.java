package algorithm.heap;

public class HeapSort {
    public static int[] sort(int[] arr, int x, int y) {
        int tmp = arr[x];
        arr[x] = arr[y];
        arr[y] = tmp;

        return arr;
    }

    // 부모노드가 자식보다 항상 크거나 항상 작은 이진트리
    public static void main(String[] args) {
        int[] arr = new int[]{6, 5, 7, 8};

        for (int i = arr.length-1; i >= 0; i--) {
            
        }
    }
}
