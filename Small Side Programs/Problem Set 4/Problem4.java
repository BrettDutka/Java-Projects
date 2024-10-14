import java.util.*;

public class Problem4 {

    public static String pqToString(PriorityQueue<String> P) {
        if(P.isEmpty())
            return("{}");
        else{
            String ans = "{";
            PriorityQueue<String> copy = new PriorityQueue<>(P);
            while(!copy.isEmpty()){
                ans += copy.poll() + ", ";
            }
            ans = ans.substring(0, ans.length() - 2) + "}";
            return ans;
        }
    }

}
