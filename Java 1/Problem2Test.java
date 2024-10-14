import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void grocery() {
        assertEquals(20.68, Problem2.grocery(1, 2, 3, 4, 5));
        assertEquals(0, Problem2.grocery(0, 0, 0, 0, 0));
    }
}