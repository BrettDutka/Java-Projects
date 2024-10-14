import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

class Problem3 {

    /**
     * Gets all the unique pairs of numbers in the array that add up to the target value.
     * Each pair is returned as a Set so they are unique
     * @param A given array of integers to search through
     * @param t target sum for pairs
     * @return a set containing lists of integers pairs that sum to target
     */
    static Set<List<Integer>> twoSum(int[] A, int t) {
        Set<List<Integer>> ans = new HashSet<>();
        Set<Integer> s = new HashSet<>();

        for(int num: A){
            int cmplmt = t - num;
            if(s.contains(cmplmt)){
                List<Integer> pairs = Arrays.asList(num, cmplmt);
                pairs.sort(Integer::compareTo);
                ans.add(pairs);
            }
            s.add(num);
        }
        return ans;
    }
}