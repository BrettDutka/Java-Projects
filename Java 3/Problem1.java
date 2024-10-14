class Problem1 {

    /**
     * Generates an array of strings for each number in [min, max]
     * "Fizz" divisible by 3
     * "Buzz" divisible by 5
     * "FizzBuzz" divisible by both.
     *
     * @param min start of interval which is inclusive
     * @param max end of interval also inclusive
     * @return an array of strings that are fizz, buzz, or fizzbuzz.
     */
    static String[] fizzBuzz(int min, int max) {
        String[] ans = new String[max - min + 1];
        for(int i = min; i <= max; i++){
            if(i % 3 == 0 && i % 5 == 0){
                ans[i - min] = "FizzBuzz";
            } else if(i % 3 == 0){
                ans[i - min] = "Fizz";
            } else if(i % 5 == 0){
                ans[i - min] = "Buzz";
            } else{
                ans[i - min] = Integer.toString(i);
            }
        }
        return ans;
    }
}