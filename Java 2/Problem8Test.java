import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem8Test {

    @Test
    void circleArea() {
        assertEquals(12.56, Problem8.circleArea(2, 0.5), 0.01);
        assertEquals(50.24, Problem8.circleArea(4, 0.5), 0.01);
    }
}