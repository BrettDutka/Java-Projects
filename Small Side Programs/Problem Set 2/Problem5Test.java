import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {

    @Test
    void hyperfactorial() {
        assertEquals(1, Problem5.hyperfactorial(0));
        assertEquals(1, Problem5.hyperfactorialTR(0));

        assertEquals(3628800, Problem5.hyperfactorial(10));
        assertEquals(3628800, Problem5.hyperfactorialTR(10));
    }

    @Test
    void hyperfactorialTR() {
        assertEquals(1, Problem5.hyperfactorialTR(0));
        assertEquals(3628800, Problem5.hyperfactorialTR(10));
    }
}