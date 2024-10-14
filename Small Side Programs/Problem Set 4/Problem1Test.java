import org.junit.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class Problem1Test {

    @Test
    public void toTreeSetTest() {
        LinkedList<Double> list = new LinkedList<>();
        list.add(1.0);
        list.add(2.0);

        TreeSet<Double> expectedAns = new TreeSet<>();
        expectedAns.add(1.0);
        expectedAns.add(2.0);

        assertAll(
                () -> {
                    TreeSet<Double> ans = Problem1.toTreeSet(list);
                    assertEquals(expectedAns, ans);
                }
        );
    }
}