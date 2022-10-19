package week5_20221017_20221021.day_221019.stack;

import java.util.Arrays;

public class Stack01 {
    private int[] arr = new int[10000];
    private int pointer = 0;

    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        this.arr[this.pointer] = value;
        this.pointer += 1;
    }

    public int[] getArr() {
        return arr;
    }

    public static void main(String[] args) {
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);
        System.out.println(Arrays.toString(stack01.getArr()));
    }
}
