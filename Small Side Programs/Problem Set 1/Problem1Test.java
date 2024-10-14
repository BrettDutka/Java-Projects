import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @org.junit.jupiter.api.Test
    void userId() {
        assertEquals("CrottJ99", Problem1.userId("Joshua", "Crotts", 1999));
        assertEquals("JohnsK18", Problem1.userId("Katherine", "Johnson", 1918));
        assertEquals("FuF57", Problem1.userId("Fred", "Fu", 1957));

    }
}