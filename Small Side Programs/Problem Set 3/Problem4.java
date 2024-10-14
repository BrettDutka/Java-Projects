import java.lang.reflect.Array;
import java.util.ArrayList;

public class Problem4 {
    public static ArrayList<String> shift(ArrayList<String> ls, int i){
        if(ls.isEmpty() || ls.size() == 1 || (ls.size() == 2 && Math.abs(i) > 1))
            return ls;

        ArrayList<String> result = new ArrayList<>();
        int shift = i % ls.size();
        if(shift < 0)
            shift += ls.size();

        for(int j = 0; j < ls.size(); j++){
            int index = (j - shift + ls.size()) % ls.size();
            result.add(ls.get(index));
        }
        return result;
    }
}
