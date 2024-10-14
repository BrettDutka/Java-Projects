
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class Problem4Test {

    @Test
    void pqToStringTest() {
        PriorityQueue<String> q = new PriorityQueue<>();
        q.add("x");
        q.add("y");
        q.add("z");


        assertAll(
                () -> {
                    String ans = Problem4.pqToString(q);
                    assertEquals("{x, y, z}", ans);
                }
        );
    }
}
