import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

class Problem6Test {

    @Test
    void testWordCount() {
        String into = "Go Hoosiers Football, Basketball, Baseball, and Soccer. Hoosiers are first!";
        HashMap<String, Integer> real = new HashMap<>();
        real.put("go", 1);
        real.put("hoosiers", 2);
        real.put("football", 1);
        real.put("basketball", 1);
        real.put("baseball", 1);
        real.put("soccer", 1);
        real.put("are", 1);
        real.put("first", 1);
        real.put("and", 1);
        HashMap<String, Integer> ans = Problem6.wordCount(into);

        assertEquals(real, ans);
    }
}
