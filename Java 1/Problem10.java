public class Problem10 {
    /**
     * Calculates how many small candy bars fit in a box with a weight limit.
     * Starts with the biggest first then goes to the small bars.
     * @param s number of small candy bars
     * @param l number of large candy bars
     * @param w max weight limit of box
     * @return number of small bars than can fit, and will return -1 if they cant fit
     */
    public static int fitCandy(int s, int l, int w){
        int candyWeight = l * 5;

        if(candyWeight > w){
            return 1;
        }
        int remainder = w - candyWeight;
        if(s > remainder)
            return remainder;
        else if(s + candyWeight > w)
            return -1;
        else
            return s;
    }
}
