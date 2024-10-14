import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void toMaxHeap() {
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(3);
        set.add(8);

        PriorityQueue<Integer> expectedAns = new PriorityQueue<>(
                new Comparator<Integer>() {
                    public int compare(Integer a, Integer b) {
                        return b - a;
                    }
                }
        );
        expectedAns.addAll(set);

        assertAll(
                () -> {
                    PriorityQueue<Integer> ans = Problem3.toMaxHeap(set);
                    assertEquals(expectedAns, ans);
                }


        );
        set.add(10);
        expectedAns.add(10);
        assertAll(
                () -> {
                    PriorityQueue<Integer> ans = Problem3.toMaxHeap(set);
                    assertEquals(expectedAns, ans);
                }
        );

    }
}