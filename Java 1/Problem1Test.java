import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @org.junit.jupiter.api.Test
    void gigameterToLightsecond() {
        double expected = 3.3356409519815204;
        double real = Problem1.gigameterToLightsecond(1);
        assertEquals(expected, real, 0.00000001);
    }
}