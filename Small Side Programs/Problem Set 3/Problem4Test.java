import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void shift() {
        ArrayList<String> given = new ArrayList<>();
        given.add("11");
        given.add("12");
        given.add("13");
        given.add("14");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("12");
        expected.add("13");
        expected.add("14");
        expected.add("11");

        assertEquals(expected, Problem4.shift(given, -1));
    }
}