public class Problem1 {
    public static int[] accSum(int[] A){
        int[] result = new int[A.length];
        int sum = 0;
        for(int i = 0; i < A.length; i++){
            sum += A[i];
            result[i] = sum;
        }
        return result;
    }
}
