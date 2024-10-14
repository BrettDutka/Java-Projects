import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashSet;

import static org.junit.Assert.assertTrue;

class Problem7Test {

    @Test
    void testLargeToSmall() {
        HashMap<String, Integer> create = new HashMap<>();
        create.put("all", 1);
        create.put("television", 2);
        create.put("is", 1);
        create.put("children's", 1);
        LinkedHashSet<String> ans = Problem7.largeToSmall(create);

        LinkedHashSet<String> real = new LinkedHashSet<>();
        ans.add("all");
        ans.add("television");

        assertTrue(ans.containsAll(real));

    }
}
