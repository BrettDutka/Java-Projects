import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem12Test {

    @Test
    void stateOfMatter() {
        assertEquals("Liquid", Problem12.stateOfMatter(50, 'C'));
        assertEquals("Gas", Problem12.stateOfMatter(212, 'F'));
    }
}