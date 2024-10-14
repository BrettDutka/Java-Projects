public class Problem3 {
    public static int[] countEvenOdds(int[] vals){
        int evenCount = 0;
        int oddCount = 0;
        for(int val : vals){
            if(val % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        return new int[]{evenCount, oddCount};
    }
}
