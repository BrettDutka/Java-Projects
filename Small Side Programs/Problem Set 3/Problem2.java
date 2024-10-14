import java.util.ArrayList;

public class Problem2 {
    public static double sumNasty(ArrayList<Integer> vals){
        double sum = 0;
        int count = 0;
        for(int i = 0; i < vals.size(); i++){
            if(vals.get(i) != 9){
                sum += vals.get(i);
                count++;
            } else if(i < vals.size() - 1)
                i++;
        }
        return count == 0 ? 0.0 : sum / count;

    }
}
