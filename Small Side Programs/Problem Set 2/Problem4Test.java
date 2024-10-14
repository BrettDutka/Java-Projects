import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void replaceABTR() {
        String input = "ABC";
        String expected = "BBC";
        String actual = Problem4.replaceABTR(input);
        assertEquals(expected, actual);
    }
}