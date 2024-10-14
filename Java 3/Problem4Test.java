import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

class Problem4Test {

    @Test
    void testPeakFinder() {
        assertAll(
                () -> assertArrayEquals(new int[]{13}, Problem4.peakFinder(new int[]{9, 13, 7, 2, 8})),
                () -> assertArrayEquals(new int[]{8}, Problem4.peakFinder(new int[]{8, 7, 8, 7, 8, 7, 8, 7}))
        );
    }

    @Test
    void peakFinder() {
        assertAll(
                () -> assertArrayEquals(new int[]{}, Problem4.peakFinder(new int[]{})),
                () -> assertArrayEquals(new int[]{3}, Problem4.peakFinder(new int[]{1, 2, 3, 2, 1}))
        );
    }
}
