import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class LazyListTakeTest {

  @Test
  void testLazyListTake() {
    ILazyList<Integer> ll = new TestLazyList<>(new Integer[]{1, 2, 3, 4, 5});
    LazyListTake<Integer> llTake = new LazyListTake<>(ll, 3);
    List<Integer> ans = llTake.getList();
    assertEquals(List.of(1, 2, 3), ans);
  }

  private static class TestLazyList<T> implements ILazyList<T> {
    private final T[] info;
    private int i = 0;

    TestLazyList(T[] info) {
      this.info = info;
    }

    @Override
    public T next() {
      return info[i++];
    }

  }
}
