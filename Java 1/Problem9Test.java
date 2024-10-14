import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem9Test {

    @Test
    void isInsideCircle() {
        assertTrue(Problem9.isInsideCircle(0, 0, 10, 5, 5));
        assertFalse(Problem9.isInsideCircle(0, 0, 5, 7, 7));
    }
}