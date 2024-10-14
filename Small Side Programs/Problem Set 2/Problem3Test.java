import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void replaceAB() {
        String input = "XAXXBXXC";
        String expected = "XBXXBXXC";
        String actual = Problem3.replaceAB(input);
        assertEquals(expected, actual);
    }
}