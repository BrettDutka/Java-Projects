import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem7Test {

    @Test
    void lessThan20() {
        assertTrue(Problem7.lessThan20(5, 10, 15));
        assertFalse(Problem7.lessThan20(300, 200, 100));
        assertTrue(Problem7.lessThan20(50,100,60));
    }
}