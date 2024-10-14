import java.util.List;

class Problem10 {

    /**
     * Checks whether two lists of integers are parallel or not.
     * They are parallel if there is a constant factor that can be multiplied by every element.
     * @param t first list of integer
     * @param u second list of integer
     * @return true if lists are parallel, false if they are not
     */
    static <T extends List<Integer>> boolean areParallelLists(T t, T u) {
        if(t == null || u == null || t.size() != u.size() || t.isEmpty()){
            return false;
        }
        Integer r = null;
        for(int i = 0; i < t.size(); i++){
            if(t.get(i) == 0 || u.get(i) == 0){
                if(!t.get(i).equals(u.get(i))){
                    return false;
                }
                continue;
            }
            int current = u.get(i) / t.get(i);
            if(r == null){
                r = current;
            } else if(!r.equals(current)){
                return false;
            }
        }
        return true;
    }
}
