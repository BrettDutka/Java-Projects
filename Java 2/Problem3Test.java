import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void collatz() {
        assertEquals("5,16,8,4,2,1", Problem3.collatz(5));
        assertEquals("3,10,5,16,8,4,2,1", Problem3.collatz(3));
    }

    @Test
    void collatzTR() {
        assertEquals("5,16,8,4,2,1", Problem3.collatzTR(5));
        assertEquals("3,10,5,16,8,4,2,1", Problem3.collatzTR(3));
    }

    @Test
    void collatzLoop() {
        assertEquals("5,16,8,4,2,1", Problem3.collatzLoop(5));
        assertEquals("3,10,5,16,8,4,2,1", Problem3.collatzLoop(3));
    }
}