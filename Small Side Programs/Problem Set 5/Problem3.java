import java.util.List;
import java.util.stream.Collectors;

public class Problem3 {
    public static List<Double> filterThenSquare(List<Double> list){
        return list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .toList();
    }
}
