import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void countStrTR() {
        String test = "This string has one str occurrence";
        int expected = 1;
        int actual = Problem2.countStrTR(test);
        assertEquals(expected, actual);
    }
}