import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem10Test {

    @Test
    void fitCandy() {
        assertEquals(4, Problem10.fitCandy(4, 1, 9));
        assertEquals(6, Problem10.fitCandy(6, 1, 13));
        assertEquals(1, Problem10.fitCandy(50, 100, 150));
    }
}