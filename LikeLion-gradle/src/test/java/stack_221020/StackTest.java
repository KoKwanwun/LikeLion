package stack_221020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    Stack st = new Stack();

    @BeforeEach
    void setUp() {
        System.out.println("Before Test");
    }

    @Test
    void pushAndPop() {
        System.out.println("push 10, 20");
        Integer[] arr = st.getArr();
        st.push(10);
        st.push(20);

        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
        
        assertEquals(20, st.pop());
        assertEquals(10, st.pop());
    }
}