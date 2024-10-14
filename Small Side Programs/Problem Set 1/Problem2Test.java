import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void computeGpa() {
        assertEquals(4.0, Problem2.computeGpa("A"));
        assertEquals(3.3, Problem2.computeGpa("B+"));
        assertEquals(2.0, Problem2.computeGpa("C"));
        assertEquals(1.3, Problem2.computeGpa("D+"));
        assertEquals(0, Problem2.computeGpa("F"));
        assertEquals(0.0, Problem2.computeGpa("Z"));
    }
}