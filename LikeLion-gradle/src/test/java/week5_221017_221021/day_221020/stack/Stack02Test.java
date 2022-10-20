package week5_221017_221021.day_221020.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {
    @BeforeEach
    void setUp() {
        System.out.println("Before Test");
    }

    @Test
    void push() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();

        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    void pushAndPop() {
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);

        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
        // st.pop() 비어있을땐?
        // Exception예외의 검증
        assertThrows(EmptyStackException.class, ()->{
            st.pop();
        });


    }

    @Test
    void isEmpty() {
        Stack02 st = new Stack02();
        assertTrue(st.isEmpty());
        st.push(10);
        assertFalse(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());
    }

    @Test
    void peek() {
        Stack02 st = new Stack02();
        // stack이 비었는데 peek()할때
        assertThrows(EmptyStackException.class, ()->{
            st.peek();
        });
        st.push(10);
        int peeked = st.peek();
        assertEquals(10, peeked);
    }

    @Test
    void realStack() {
        Stack<Integer> st = new Stack();
        assertThrows(EmptyStackException.class, ()->{
            st.pop();
        });
    }
}