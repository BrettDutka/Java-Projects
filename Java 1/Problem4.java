public class Problem4 {
    /**
     * Removes first and last character from the given
     *
     * @param s given string to remove first and last character from
     * @return new string with first and last character stripped
     */
    public static String flStrip(String s){
        if(s.length() < 2){
            return s;
        }
        return s.substring(1, s.length()-1);
    }
}
