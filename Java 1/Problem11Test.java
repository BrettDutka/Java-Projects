import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem11Test {

    @Test
    void isValidIpv4() {
        String valid = "192.168.1.1";
        assertTrue(Problem11.isValidIpv4(valid));

        String invalid = "192.168.1.300";
        assertFalse(Problem11.isValidIpv4(invalid));
    }
}