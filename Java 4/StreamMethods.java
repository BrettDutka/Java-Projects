import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class StreamMethods {

    /**
     * Gets rid of all strings that have more characters than the given length
     * @param los list of strings to filter
     * @param n the max length of strings allowed
     * @return the new list that contains strings with less length than max length
     */
    public static List<String> removeLonger(List<String> los, int n){
        return los.stream()
                .filter(s -> s.length() <= n)
                .collect(Collectors.toList());
    }

    /**
     * Squares and adds 5 to every integer in the list and removes the ones that end in 5 or 6
     * @param lon the list of integers that need to be changed
     * @return a list containing the integers that were changed
     */

    public static List<Integer> sqAddFiveOmit(List<Integer> lon){
        return lon.stream()
                .map(i -> i * i + 5)
                .filter(i -> !String.valueOf(i).matches(".*[56]$"))
                .collect(Collectors.toList());
    }

    /**
     * Groups the lists together depending on their length and the number of strings each length has
     *
     * @param los list of strings given that need to be grouped
     * @return a map where the keys are string lengths and values are grouped with strings of same length
     */
    public static Map<Integer, Integer> groupLength(List<String> los){
        return los.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
    }

    /**
     * helper method that checks if the integer ends with five or six and links with sqAddFiveOmit
     * @param i integer that needs to be checked for 5 or 6
     * @return true if int ends with 5 or 6 and if it does not then it is false
     */

    private static boolean endsWithFiveOrSix(int i){
        int lDigit = i % 10;
        return lDigit == 5 || lDigit == 6;
    }
}
