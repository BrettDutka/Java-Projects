class CyclicLazyList implements ILazyList<Integer> {
  private final Integer[] nums;
  private int i = 0;

  CyclicLazyList(Integer... nums) {
    this.nums = nums;
  }

  @Override
  public Integer next() {
    Integer em = nums[i];
    i++;
    if(i == nums.length)
      i = i % nums.length;

    return em;
  }
}
