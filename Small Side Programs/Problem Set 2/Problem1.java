public class Problem1 {
    public static int countStr(String s){
        if(s.length() < 3){
            return 0;
        }
        if(s.substring(0, 3).equals("str")){
            return 1 + countStr(s.substring(3));
        } else{
            return countStr(s.substring(1));
        }
    }
}
