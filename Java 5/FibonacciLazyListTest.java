import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciLazyListTest {

  @Test
  public void testFibonacciLazyList() {
    FibonacciLazyList fList = new FibonacciLazyList();

    assertEquals("First is 0", 0, (int)fList.next());
    assertEquals("Second is 1", 1, (int)fList.next());
    assertEquals("Third is 1", 1, (int)fList.next());
    assertEquals("Fourth is 2", 2, (int)fList.next());
    assertEquals("Fifth is 3", 3, (int)fList.next());
    assertEquals("Sixth is 5", 5, (int)fList.next());
    assertEquals("Seventh is 8", 8, (int)fList.next());
    assertEquals("Eighth is 13", 13, (int)fList.next());
    assertEquals("Ninth is 21", 21, (int)fList.next());
    assertEquals("Tenth is 34", 34, (int)fList.next());
  }
}
