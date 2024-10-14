public class Problem4 {
    public static boolean isLeapYear(int y){
        if(y % 4 == 0){
            if(y % 100 != 0){
                return true;
            }
            if(y % 400 == 0){
                return true;
            }
        }
        return false;
    }
}
