class FibonacciLazyList implements ILazyList<Integer> {
  private int n;
  private int n2;

  FibonacciLazyList(){
    this.n = 0;
    this.n2 = 1;
  }
  @Override
  public Integer next() {
    int tmp = n;
    n = n2;
    n2 = tmp + n;
    return tmp;
  }
}
