import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem3Test {

    @Test
    void pyramidSurfaceArea() {
        double l = 2;
        double w = 3;
        double h = 4;
        double expectedArea = 26.91332062217051;
        double real = Problem3.pyramidSurfaceArea(l, w, h);
        assertEquals(expectedArea, real);


    }
}