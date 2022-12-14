package algorithm.stack;

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
        this.pointer++;
    }

    public int pop() {
        this.pointer--;
        return this.arr[this.pointer];
    }

    public int[] getArr() {
        return arr;
    }

    public static void main(String[] args) {
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);
        System.out.println(Arrays.toString(stack01.getArr()));
        System.out.println(stack01.pop());
        System.out.println(Arrays.toString(stack01.getArr()));
    }
}
