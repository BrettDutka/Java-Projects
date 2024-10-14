import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Problem1Test {
    @Test
    void testCountStr(){
        String test = "This string has no occurrences";
        int expected = 0;
        int actual = Problem1.countStr(test);
        assertEquals(expected, actual);
    }
}