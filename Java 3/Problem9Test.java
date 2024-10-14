import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

class Problem9Test {

    @Test
    void testStringifyList() {
        assertAll(
                () -> assertEquals("1, 2, 3", Problem9.stringifyList(Arrays.asList(1, 2, 3))),
                () -> assertEquals("Hello, World", Problem9.stringifyList(Arrays.asList("Hello", "World"))),
                () -> assertEquals("", Problem9.stringifyList(Arrays.asList()))



        );
    }
}
