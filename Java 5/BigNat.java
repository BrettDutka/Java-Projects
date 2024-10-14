import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

class BigNat implements Comparable<BigNat> {
  private List<Integer> nums;

  BigNat(String number) {
    nums = new ArrayList<>();
    for(int i = number.length() - 1; i >= 0; i--){
      nums.add(number.charAt(i) - '0');
    }
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for(int i = nums.size() - 1; i >= 0; i--){
      sb.append(nums.get(i));
    }
    return sb.toString();
  }

  @Override
  public BigNat clone() {
    BigNat copy = new BigNat("0");
    copy.nums = new ArrayList<>(this.nums);
    return copy;
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj)
      return true;
    if(obj == null || getClass() != obj.getClass())
      return false;
    BigNat bigNat = (BigNat) obj;
    return Objects.equals(nums, bigNat.nums);
  }

  @Override
  public int compareTo(BigNat b) {
    if(nums.size() < b.nums.size())
      return -1;
    if(nums.size() > b.nums.size())
      return 1;
    for(int i = nums.size() - 1; i >= 0; i--){
      if(!nums.get(i).equals(b.nums.get(i))){
        return Integer.compare(nums.get(i), b.nums.get(i));
      }
    }
    return 0;
  }

  void add(BigNat bn) {
    int c = 0;
    int max = Math.max(nums.size(), bn.nums.size());
    for(int i = 0; i < max; i++){
      int a = i < nums.size() ? nums.get(i) : 0;
      int b = i < bn.nums.size() ? bn.nums.get(i) : 0;
      int sum = a + b + c;
      c = sum / 10;
      if(i < nums.size()){
        nums.set(i, sum % 10);
      }else{
        nums.add(sum % 10);
      }
    }
    if(c > 0)
      nums.add(c);
  }

  /**
   * Subtracts the given BigNat from this BigNat. If the given BigNat is bigger than this BigNat then it is set to zero.
   *
   * @param bn the given bignat
   */
  void sub(BigNat bn) {
    if(compareTo(bn) < 0){
      nums.clear();
      nums.add(0);
      return;
    }
    int brw = 0;
    for(int i = 0; i < nums.size(); i++){
      int a = nums.get(i);
      int b = i < bn.nums.size() ? bn.nums.get(i) : 0;
      int sub = a - b - brw;
      if(sub < 0){
        sub += 10;
        brw = 1;
      }else{
        brw = 0;
      }
      nums.set(i, sub);
    }
    while(nums.size() > 1 && nums.get(nums.size() - 1) == 0){
      nums.remove(nums.size() - 1);
    }
  }

  void mul(BigNat bn) {
    List<Integer> ans = new ArrayList<>(Collections.nCopies(nums.size() + bn.nums.size(), 0));
    for(int i = 0; i < nums.size(); i++){
      for(int j = 0; j < bn.nums.size(); j++){
        ans.set(i + j, ans.get(i + j) + nums.get(i) * bn.nums.get(j));
        ans.set(i + j + 1, ans.get(i + j + 1) + ans.get(i + j) / 10);
        ans.set(i + j, ans.get(i + j) % 10);
      }
    }
    while(ans.size() > 1 && ans.get(ans.size() - 1) == 0){
      ans.remove(ans.size() - 1);
    }
    nums = ans;
  }

  void div(BigNat bn) {
    if(bn.nums.size() == 1 && bn.nums.get(0) == 0) {
      throw new IllegalArgumentException("Division by zero");
    }
    if(compareTo(bn) < 0){
      nums.clear();
      nums.add(0);
      return;
    }
    List<Integer> ans = new ArrayList<>();
    BigNat rem = new BigNat("0");
    rem.nums.clear();
    for(int i = nums.size() - 1; i >= 0; i--){
      rem.nums.add(0, nums.get(i));
      while(rem.nums.size() > 1 && rem.nums.get(rem.nums.size() - 1) == 0){
        rem.nums.remove(rem.nums.size() - 1);
      }
      int tmp = 0;
      while(rem.compareTo(bn) >= 0){
        rem.sub(bn);
        tmp++;
      }
      ans.add(tmp);
    }
    Collections.reverse(ans);
    while(ans.size() > 1 && ans.get(0) == 0){
      ans.remove(0);
    }
    nums = ans;
  }
}


