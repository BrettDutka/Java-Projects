import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

class Problem2Test {

    @Test
    void testMedian() {
        int[] A1 = {1 , 3, 5};
        int[] B1 = {2, 4, 6};
        assertArrayEquals((int) 3.5, Problem2.median(A1, B1));

        int[] A2 = {1, 2};
        int[] B2 = {3, 4, 5};
        assertArrayEquals(3, Problem2.median(A2, B2));
    }

    @Test
    void median() {
        int[] A1 = {1, 2, 3, 4, 5, 6, 7};
        int[] B1 = {8, 9, 10, 11, 12, 13, 14, 15};
        assertArrayEquals(8, Problem2.median(A1, B1));

        int[] A2 = {100, 200, 300};
        int[] B2 = {1, 2, 3, 4, 5};
        assertArrayEquals(3, Problem2.median(A2, B2));
    }

    private void assertArrayEquals(int i, int median) {
    }
}
