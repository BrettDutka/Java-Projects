import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @Test
    void conjoin() {
        List<String> list = List.of("a", "b", "c");
        String ans = Problem1.conjoin(list);
        assertEquals("a, b, c", ans);
    }
}