import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CyclicLazyListTest {

  @Test
  void testCyclicLazyList() {
    CyclicLazyList ls = new CyclicLazyList(1, 2, 3);
    assertEquals(1, ls.next(), "First is 1");
    assertEquals(2, ls.next(), "Second is 2");
    assertEquals(3, ls.next(), "Third is 3");

    assertEquals(1, ls.next(), "Fourth is 1");
    assertEquals(2, ls.next(), "Fifth is 2");
    assertEquals(3, ls.next(), "Sixth is 3");

    assertEquals(1, ls.next(), "Seventh is 1");
    assertEquals(2, ls.next(), "Eighth is 2");
    assertEquals(3, ls.next(), "Ninth is 3");
  }
}
