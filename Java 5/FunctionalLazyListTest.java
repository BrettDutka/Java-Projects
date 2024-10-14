import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunctionalLazyListTest {

  @Test
  void testFunctionalLazyList() {
    Function<Integer, Integer> next = x -> x + 1;
    FunctionalLazyList<Integer> list = new FunctionalLazyList<>(next, 0);

    assertEquals(0, list.next());
    assertEquals(1, list.next());
    assertEquals(2, list.next());

    Function<String, String> add = s -> s + "!";
    FunctionalLazyList<String> stringList = new FunctionalLazyList<>(add, "Hello");

    assertEquals("Hello", stringList.next());
    assertEquals("Hello!", stringList.next());
    assertEquals("Hello!!", stringList.next());
  }
}
