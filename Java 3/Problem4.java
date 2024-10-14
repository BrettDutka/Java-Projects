import java.util.HashSet;
import java.util.Set;

class Problem4 {

    /**
     * Gets the unique peak of the given array. Only records the peak value once since its a set.
     * @param peaks an array of integers that represents the peaks of mountains.
     * @return An array of integers of the unique peaks.
     */
    static int[] peakFinder(int[] peaks) {
        Set<Integer> peak = new HashSet<>();
        for(int i = 1; i < peaks.length - 1; i++){
            if (peaks[i] > peaks[i - 1] && peaks[i] > peaks[i + 1]){
                peak.add(peaks[i]);
            }
        }
        return peak.stream().mapToInt(Number::intValue).toArray();
    }
}