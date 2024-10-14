import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem8Test {

    @Test
    void not() {
        assertTrue(Problem8.not(false));
        assertFalse(Problem8.not(true));
    }

    @Test
    void and() {
        assertTrue(Problem8.and(true, true));
        assertFalse(Problem8.and(true, false));
    }

    @Test
    void or() {
        assertTrue(Problem8.or(true, false));
        assertFalse(Problem8.or(false, false));
    }

    @Test
    void cond() {
        assertFalse(Problem8.cond(true, false));
        assertTrue(Problem8.cond(false, true));
    }

    @Test
    void bicond() {
        assertTrue(Problem8.bicond(true, true));
        assertFalse(Problem8.bicond(true, false));
    }
}