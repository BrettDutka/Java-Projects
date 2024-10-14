import java.util.*;

public class Problem1 {
    public static TreeSet<Double> toTreeSet(LinkedList<Double> ls) {
        TreeSet<Double> set = new TreeSet<>();
        for(Double x : ls){
            set.add(x);
        }
        return set;
    }
}