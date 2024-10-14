import org.junit.jupiter.api.Test;

import java.beans.beancontext.BeanContextServiceProviderBeanInfo;

import static org.junit.jupiter.api.Assertions.*;

class Problem1Test {

    @Test
    void accSum() {
        assertArrayEquals(new int[]{1, 8, 10, 19}, Problem1.accSum(new int[]{1, 7, 2, 9}));
        assertArrayEquals(new int[]{1, 4, 7, 11, 16, 21, 27, 33, 35}, Problem1.accSum(new int[]{1, 3, 3, 4, 5, 5, 6, 6, 2}));
        assertArrayEquals(new int[]{5, 10, 15, 20, 25, 25, 30, 35, 36, 41}, Problem1.accSum(new int[]{5, 5, 5, 5, 5, 5, 5, 1, 5}));
    }
}