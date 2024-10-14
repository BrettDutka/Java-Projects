public class Problem5 {
    public static long hyperfactorial(long n){
        if(n == 0){
            return 1;
        }
        return n * hyperfactorial(n - 1);
    }

    private static long hyperfactorialTRHelper(long n, long acc){
        if(n == 0){
            return acc;
        }
        return hyperfactorialTRHelper(n - 1, acc * n);
    }

    public static long hyperfactorialTR(long n){
        return hyperfactorialTRHelper(n, 1);
    }
}
