import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

class Problem5Test {

    @Test
    void testTokenize() {
        assertEquals(new ArrayList<>(Arrays.asList("Hello", "World")), Problem5.tokenize("Hello,World", ','));
        assertEquals(new ArrayList<>(Arrays.asList("one", "two", "three")), Problem5.tokenize("one two three", ' '));
    }

    @Test
    void tokenize() {
        ArrayList<String> real = new ArrayList<>(Arrays.asList("Hello", "World"));
        ArrayList<String> ans = Problem5.tokenize("Hello,World", ',');
        assertEquals(real, ans);
    }
}
