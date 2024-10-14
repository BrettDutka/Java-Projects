import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void addYRemoveYY() {
        List<String> list = List.of("cat", "dog");
        List<String> real = List.of("caty", "dogy");
        List<String> ans = Problem2.addYRemoveYY(list);
        assertEquals(real, ans);
    }
}