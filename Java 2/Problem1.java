public class Problem1 {

    /**
     * Calculates the greatest common divisor between a and b using tail recursion
     * @param a first given number
     * @param b second given number
     * @return the GCD between a and b
     */
    public static int gcdTR(int a, int b){
        if(b == 0)
            return a;

        return gcdTR(b, a% b);
    }

    /**
     * Calculates the greatest common divisor between a and b by using while loop
     * @param a first given number
     * @param b second given number
     * @return the GCD between a and b
     */
    public static int gcdLoop(int a, int b){
        while(b != 0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
}
