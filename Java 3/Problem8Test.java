import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

class Problem8Test {

    @Test
    void testPostfixEvaluator() {
        assertAll(
                () -> assertEquals(10, Problem8.postfixEvaluator(Arrays.asList("5", "2", "*")), 0.01),
                () -> assertEquals(15, Problem8.postfixEvaluator(Arrays.asList("5", "2", "*", "5", "+")), 0.01),
                () -> assertEquals(10, Problem8.postfixEvaluator(Arrays.asList("1", "2", "3", "4", "+", "+", "+")),0.01)
        );
    }
}
