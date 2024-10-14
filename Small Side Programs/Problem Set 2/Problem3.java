public class Problem3 {
    public static String replaceAB(String s){
        if(s.length() == 0){
            return s;
        }
        if(s.charAt(0) == 'A'){
            return "B" + replaceAB(s.substring(1));
        } else{
            return s.charAt(0) + replaceAB(s.substring(1));
        }
    }
}
