import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem6Test {

    @Test
    void computeRoundSum() {
        assertEquals(10, Problem6.computeRoundSum(-2, 5, -3));
        assertEquals(60, Problem6.computeRoundSum(12, 30, 18));
    }
}