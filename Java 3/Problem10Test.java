import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

class Problem10Test {

    @Test
    void testAreParallelLists() {
        assertAll(
                () -> assertTrue(Problem10.areParallelLists(Arrays.asList(5, 10, 15, 20), Arrays.asList(20, 40, 60, 80))),
                () -> assertFalse(Problem10.areParallelLists(Arrays.asList(1, 2, 3), Arrays.asList(2, 4, 6, 8))),
                () -> assertTrue(Problem10.areParallelLists(Arrays.asList(100, 200, 300, 200), Arrays.asList(10, 20, 30, 20)))
        );
    }
}
