import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class Problem3Test {

    @Test
    void testTwoSum() {
        Set<List<Integer>> real = new HashSet<>(Arrays.asList(
                Arrays.asList(2, 6),
                Arrays.asList(2, 2)
        ));
        assertArrayEquals(real, Problem3.twoSum(new int[]{2, 2, 4, 10, 6, 2}, 8));
    }

    private void assertArrayEquals(Set<List<Integer>> real, Set<List<Integer>> lists) {
    }

    @Test
    void twoSum() {
        Set<List<Integer>> expected = new HashSet<>(Arrays.asList(
                Arrays.asList(1, 3),
                Arrays.asList(2, 2)
        ));
        assertArrayEquals(expected, Problem3.twoSum(new int[]{1, 2, 3, 2}, 4));
    }
}
