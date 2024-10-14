public class Problem4 {
    /**
     * Coverts string to integer copying the C atoi() function.
     * The zeros and spaces are ignored. Stops at non-first digit.
     * @param s string to convert
     * @return integer value or 0 if nothing else in s
     */
    public static int atoi(String s) {
        if (s.isEmpty())
            return 0;

        int sum = 0;
        int i = 0;
        int n = s.length();
        boolean checkNegative = false;


        while (i < n && !((s.charAt(i) >= '0' && s.charAt(i) <= '9') || s.charAt(i) == '-')){
            i++;
        }
        if(i < n && s.charAt(i) == '-'){
            checkNegative = true;
            i++;
        }
        while(i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
            int num = s.charAt(i) - '0';
            sum = sum * 10 + num;
            i++;
        }
        if(checkNegative)
            return -sum;
        return sum;
    }
}
