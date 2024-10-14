import java.util.ArrayList;
import java.util.List;

class LazyListTake<T>{
  private final ILazyList<T> lazyList;
  private final int n;

  LazyListTake(ILazyList<T> lazyList, int n) {
    this.lazyList = lazyList;
    this.n = n;
  }

  /**
   * Gets a lazy list of n elements
   * @return a list of elements given from the lazy list
   */
  List<T> getList() {
    List<T> ans = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      ans.add(lazyList.next());
    }
    return ans;
  }
}
