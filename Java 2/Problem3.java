public class Problem3 {

    /**
     * Calculates the collatz sequence using recursion
     * collatz(1) = 1
     * collatz(n) = collatz(3 * n + 1) if n is odd
     * collatz(n) = collatz(n / 2) if n is even
     *
     * @param n given number
     * @return the collatz sequence as a string that is comma seperated
     */
    public static String collatz(int n){
        if(n == 1)
            return "1";
        else if (n % 2 == 0) {
            String sequence = collatz(n / 2);
            return n + "," + sequence;
        } else{
            String sequence = collatz(3 * n + 1);
            return n + "," + sequence;
        }
    }

    /**
     * Helper method for calculating the collatz sequence with tail recursion
     * @param n current number
     * @param sequence current sequence
     * @return Comma seperated collatz string
     */

    private static String collatzHelper(int n, String sequence){
        if(n == 1)
            return sequence + "1";
        else if(n % 2 == 0)
            return collatzHelper(n / 2, sequence + n + ",");
        else
            return collatzHelper(3 * n + 1, sequence + n + ",");
    }

    /**
     * Calculates the collatz sequence using tail recursion.
     * @param n given number
     * @return The collatz sequence for n
     */
    public static String collatzTR(int n){
        return collatzHelper(n, "");
    }

    /**
     * Calculates the collatz sequence with a while loop
     * @param n given number
     * @return collatz sequence as a comma seperated string
     */
    public static String collatzLoop(int n){
        String sequence = "";
        while(n != 1){
            sequence += n + ",";
            if(n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;

        }
        return sequence + "1";
    }
}
