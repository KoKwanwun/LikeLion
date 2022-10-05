package week3_221004_221007.day_221004;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("hello");

        int[] arr = new int[10];
        for(int i = 0; i < 10; i++) {
            arr[i] = (i + 1);
        }
        for(int tmp : arr){
            System.out.println(tmp);
        }
    }
}
