package algorithm.recursion;

public class ArraySum {
    public static void arraySum(int[] arr, int idx, int sum) {
        if(idx < 0) {
            System.out.println(sum);
            return;
        }
        sum += arr[idx];
        arraySum(arr, idx-1, sum);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7, 3, 2, 9};

        arraySum(arr, arr.length-1, 0);
    }
}
