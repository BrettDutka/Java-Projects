public class Problem4 {
    private static String replaceABTRHelper(String s, String acc){
        if(s.length() == 0){
            return acc;
        }
        if(s.charAt(0) == 'A'){
            return replaceABTRHelper(s.substring(1), acc + "B");
        } else{
            return replaceABTRHelper(s.substring(1), acc + s.charAt(0));
        }
    }
    public static String replaceABTR(String s){
        return replaceABTRHelper(s, "");
    }
}
