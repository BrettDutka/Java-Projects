import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void countEvenOdds() {
        assertArrayEquals(new int[]{4, 4}, Problem3.countEvenOdds(new int[]{11, 9, 2, 3, 7, 10, 12, 50}));
        assertArrayEquals(new int[]{0, 4}, Problem3.countEvenOdds(new int[]{11, 13, 15, 17}));
    }
}