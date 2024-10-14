import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class StreamMethodsTest {

    @Test
    public void removeLonger() {
        List<String> toCheck = Arrays.asList("iran", "england", "japan", "canada", "switzerland");
        List<String> ans = Arrays.asList("iran", "japan");
        assertEquals(ans, StreamMethods.removeLonger(toCheck, 5));
    }

    @org.junit.jupiter.api.Test
    void sqAddFiveOmit() {
        List<Integer> toCheck = Arrays.asList(3, 5, 7, 9, 11);
        List<Integer> ans = Arrays.asList(14, 30, 54);
        assertEquals(ans, StreamMethods.sqAddFiveOmit(toCheck));
    }

    @org.junit.jupiter.api.Test
    void groupLength() {
        List<String> toCheck = Arrays.asList("iran", "england", "japan", "canada", "switzerland");
        Map<Integer, Integer> ans = Map.of(4, 1, 11, 1, 7, 1, 6, 2);
        assertEquals(ans, StreamMethods.groupLength(toCheck));
    }
}