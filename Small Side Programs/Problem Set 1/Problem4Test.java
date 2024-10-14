import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void isLeapYear() {
        assertTrue(Problem4.isLeapYear(1996));
        assertTrue(Problem4.isLeapYear(2000));
        assertFalse(Problem4.isLeapYear(1833));
        assertFalse(Problem4.isLeapYear(1926));
    }
}