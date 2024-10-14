import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {

    @Test
    void compareTo() {
        assertEquals(-1, Problem5.compareTo("abc", "abcd"));
        assertEquals(1, Problem5.compareTo("abcd", "abc"));
        assertEquals(-1, Problem5.compareTo("aab", "abb"));
        assertEquals(0, Problem5.compareTo("equal", "equal"));

    }
}