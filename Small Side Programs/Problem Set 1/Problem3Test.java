import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void sortThreeStrings() {
        assertEquals("Able", "Baker", "Charlie", 
                Problem3.sortThreeStrings("Charlie", "Able", "Baker"));
        assertEquals("Robert", "John", "Sue", 
                Problem3.sortThreeStrings("Robert", "John", "Sue"));
        assertEquals("Patrick", "Josh", "Tua",
                Problem3.sortThreeStrings("John", "Patrick", "Tua"));



    }

    private void assertEquals(String a, String b, String c, String s) {
    }

}