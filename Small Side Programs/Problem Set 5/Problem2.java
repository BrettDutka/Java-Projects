import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem2 {
    public static List<String> addYRemoveYY(List<String> list){
        return list.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .toList();
    }
}
