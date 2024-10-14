import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void subfactorial() {
        assertEquals(1, Problem2.subfactorial(0));
        assertEquals(0, Problem2.subfactorial(1));
        assertEquals(1, Problem2.subfactorial(2));
        assertEquals(2, Problem2.subfactorial(3));
        assertEquals(9, Problem2.subfactorial(4));
    }

    @Test
    void subfactorialTR() {
        assertEquals(1, Problem2.subfactorialTR(0));
        assertEquals(0, Problem2.subfactorialTR(1));
        assertEquals(1, Problem2.subfactorialTR(2));
        assertEquals(2, Problem2.subfactorialTR(3));
        assertEquals(9, Problem2.subfactorialTR(4));
    }

    @Test
    void subfactorialLoop() {
        assertEquals(1, Problem2.subfactorialLoop(0));
        assertEquals(0, Problem2.subfactorialLoop(1));
        assertEquals(1, Problem2.subfactorialLoop(2));
        assertEquals(2, Problem2.subfactorialLoop(3));
        assertEquals(9, Problem2.subfactorialLoop(4));
    }
}