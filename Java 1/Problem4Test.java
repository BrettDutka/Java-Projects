import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void flStrip() {
        String s1 = "Hello";
        String ans = "ell";

        assertEquals(ans, Problem4.flStrip(s1));

        String s2 = "Fruit";
        String ans2 = "rui";
        assertEquals(ans2, Problem4.flStrip(s2));
    }
}