public class Problem5 {

    /**
     * Compares two given strings lexographically without using the built-in compareTo
     * @param s1 first string
     * @param s2 second string
     * @return -1 if s1 < s2, 0 if s1 == s2, 1 if s1 > s2
     */
    public static int compareTo(String s1, String s2){
        if(s1.length() < s2.length())
            return -1;
        else if (s2.length() < s1.length())
            return 1;
        else{
            for(int i = 0; i < s1.length(); i++){
                if(s1.charAt(i) < s2.charAt(i))
                    return -1;
                else if(s1.charAt(i) > s2.charAt(i))
                    return 1;
            }
            return 0;
        }
    }
}
