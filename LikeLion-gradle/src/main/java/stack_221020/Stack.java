package stack_221020;

import java.util.Arrays;

public class Stack {
    private Integer[] arr;
    private int top = 0;

    public Stack() {
        this.arr = new Integer[10000];
    }

    public Stack(int size) {
        this.arr = new Integer[size];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push(int value){
        this.arr[this.top] = value;
        this.top++;
    }

    public int pop(){
        this.top--;
        return this.arr[this.top];
    }

    public boolean isEmpty() {
        return this.top == 0 ? true : false;
    }
}
