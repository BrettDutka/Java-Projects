import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem5Test {

    @Test
    void cutUsername() {
        String email = "richard@iu.edu";
        String ans = "richard";

        String s1 = Problem5.cutUsername(email);

        assertEquals(ans, s1);
    }
}