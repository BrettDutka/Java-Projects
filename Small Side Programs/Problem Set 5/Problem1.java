import java.util.List;
import java.util.stream.Collectors;


public class Problem1 {
    /**
     *
     * I worked with Finn Jackson
     *
     * @param list given list
     * @return a concatenated list and seperated by comma
     */
    public static String conjoin(List<String> list){
        return list.stream()
                .reduce((s1, s2) -> s1 + ", " + s2)
                .orElse("");

    }
}
