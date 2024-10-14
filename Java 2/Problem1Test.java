import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @org.junit.jupiter.api.Test
    void gcdTR() {
        assertEquals(5, Problem1.gcdTR(25, 15));
        assertEquals(9, Problem1.gcdTR(9, 99));
        assertEquals(7, Problem1.gcdTR(77, 49));
    }

    @org.junit.jupiter.api.Test
    void gcdLoop() {
        assertEquals(5, Problem1.gcdLoop(25, 15));
        assertEquals(9, Problem1.gcdLoop(9, 99));
        assertEquals(7, Problem1.gcdLoop(77, 49));
    }
}