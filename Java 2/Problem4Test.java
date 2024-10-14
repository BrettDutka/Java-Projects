import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void atoi() {
        assertEquals(43, Problem4.atoi("0043Hi"));
        assertEquals(-3000, Problem4.atoi("-3000abc"));
        assertEquals(12, Problem4.atoi("12-34"));
        assertEquals(1234567890, Problem4.atoi("1234567890"));
        assertEquals(-5000, Problem4.atoi("abc-5000abc"));
        assertEquals(150, Problem4.atoi("tes150ting"));



    }
}