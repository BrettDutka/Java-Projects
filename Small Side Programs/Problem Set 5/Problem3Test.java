import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void filterThenSquare() {
        List<Double> list = List.of(1.0, 2.0, 3.0, 4.0);
        List<Double> real = List.of(4.0, 16.0);
        List<Double> ans = Problem3.filterThenSquare(list);
        assertEquals(real, ans);
    }
}