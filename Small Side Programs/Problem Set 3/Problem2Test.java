import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Problem2Test {

    @Test
    void sumNasty() {
        ArrayList<Integer> input = new ArrayList<>();
        input.add(7);
        input.add(8);
        input.add(9);
        input.add(10);
        input.add(11);
        input.add(12);
        assertEquals(9.0, Problem2.sumNasty(input), 0.0);
    }
}