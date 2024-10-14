public class Problem6 {

    /**
     * Sums the positive ints found in given string
     * @param s string containing integers
     * @return the sum of all the positive integer, 0 if none found
     */
    public static int strSumNums(String s){
        int sum = 0;
        String currNum = "";

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c))
                currNum += c;
            else if(currNum.length() > 0){
                sum += Integer.parseInt(currNum);
                currNum = "";
            }
        }
        if(currNum.length() > 0)
            sum += Integer.parseInt(currNum);

        return sum;
    }
}
