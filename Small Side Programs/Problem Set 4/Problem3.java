import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Problem3 {

    public static PriorityQueue<Integer> toMaxHeap(HashSet<Integer> hSet){

        PriorityQueue<Integer> queue = new PriorityQueue<>(
                new Comparator<Integer>() {
                    public int compare(Integer a, Integer b) {
                        return b - a;
                    }
                }
        );
        for(Integer val : hSet){
            queue.add(val);
        }
        return queue;

    }


}
