public class Problem7 {

    /**
     * Counts the number of pairs from 1 to n - 1 that meet the requirements of:
     * (a^2 + b^2 + 1) / (a * b)
     *
     * @param n upper bound
     * @return number of valid pairs
     */
    public static int countPairs(int n){
        int tmp = 0;
        for(int a = 1; a <= n; a++){
            for(int b = a; b < n; b++){
                if((Math.pow(a, 2) + Math.pow(b, 2) + 1) % (a * b) == 0)
                    tmp++;
                }
            }
        return tmp;
    }
}
