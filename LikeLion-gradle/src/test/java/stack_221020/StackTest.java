package stack_221020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    @BeforeEach
    void setUp() {
        System.out.println("Before Test");
    }

    @Test
    void push() {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();

        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    void pushAndPop() {
        Stack st = new Stack();
        st.push(10);
        st.push(20);

        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
    }

    @Test
    void isEmpty() {
        Stack st = new Stack();
        assertTrue(st.isEmpty());
        st.push(10);
        assertFalse(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());
    }
}