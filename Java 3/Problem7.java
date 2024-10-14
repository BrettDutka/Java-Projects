import java.util.HashMap;
import java.util.LinkedHashSet;

class Problem7 {

    /**
     * Orders the words by whatever their count is, and it goes down in order (largest to smallest)
     * @param M The hashmap containing words as keys and counts as values
     * @return A LinkedHashSet with words set by largest to smallest
     */
    static LinkedHashSet<String> largeToSmall(HashMap<String, Integer> M) {
        int highest = 0;
        for(Integer tmp : M.values()){
            highest = Math.max(highest, tmp);
        }
        LinkedHashSet<String>[] ls = new LinkedHashSet[highest];
        for(int i = 0; i < highest; i++){
            ls[i] = new LinkedHashSet<>();
        }
        for(String keyInSet : M.keySet()){
            int tmp2 = M.get(keyInSet);
            ls[tmp2 - 1].add(keyInSet);
        }

        LinkedHashSet<String> ans = new LinkedHashSet<>();
        for(int i = highest - 1; i >= 0; i--){
            ans.addAll(ls[i]);
        }
        return ans;
    }
}
