public class Problem2 {

    /**
     * Calculates subfactorial of n using recursion.
     * Subfactorial function Counts the number of permutations
     *
     * @param n the input number
     * @return subfactorial of n
     */
    public static long subfactorial(long n) {
        if (n == 0)
            return 1;
        if (n == 1)
            return 0;
        return (n - 1) * (subfactorial(n - 1) + subfactorial(n - 2));
    }

    /**
     * Helper method for getting the subfactorial with recursion
     *
     * @param n   given number
     * @param acc running accumulator
     * @param x   first previous
     * @param x2  second previous
     * @return subfactorial of n
     */
    private static long subfactorialHelper(long n, long acc, long x, long x2) {
        if (n == 0)
            return acc;
        else if (n == 1)
            return acc;
        else
            return subfactorialHelper(n - 1, acc + (n - 1) * x, x + x2, x);

    }

    /**
     * Calculates subfactorial using tail recursion
     *
     * @param n the given number
     * @return subfactorial of n
     */
    public static long subfactorialTR(long n) {
        return subfactorialHelper(n,0,1, 0);
    }

    /**
     * Calculates subfactorial using a loop
     *
     * @param n the given number
     * @return the subfactorial of n
     */
    public static long subfactorialLoop(long n) {
        if(n == 0)
            return 1;
        if(n == 1)
            return 0;
        long x = 0;
        long x2 = 1;
        long acc = 0;
        for(long i = 2; i <= n; i++){
            acc += (i - 1) * (x + x2);
            long tmp = x;
            x = acc;
            x2 = tmp;
        }
        return acc;
    }
}
