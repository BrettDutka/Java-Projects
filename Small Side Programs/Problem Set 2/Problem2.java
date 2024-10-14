public class Problem2 {
    private static int countStrTRHelper(String s, int count){
        if(s.length() < 3){
            return count;
        }
        if(s.substring(0, 3).equals("str")){
            return countStrTRHelper(s.substring(3), count + 1);
        } else{
            return countStrTRHelper(s.substring(1), count);
        }
    }

    public static int countStrTR(String s){
        return countStrTRHelper(s, 0);
    }
}
