import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem7Test {

    @Test
    void countPairs() {
        assertEquals(3, Problem7.countPairs(6));
        assertEquals(3, Problem7.countPairs(10));
        assertEquals(0, Problem7.countPairs(1));
        assertEquals(1, Problem7.countPairs(2));
        assertEquals(2, Problem7.countPairs(5));
    }
}