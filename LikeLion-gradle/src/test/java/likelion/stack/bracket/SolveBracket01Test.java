package likelion.stack.bracket;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracket01Test {
    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket() {
        SolveBracket01 sb = new SolveBracket01();
        assertTrue(sb.solution("()()"));
        assertTrue(sb.solution("(())()"));
        assertFalse(sb.solution(")()("));
        assertFalse(sb.solution("(()("));
    }
}