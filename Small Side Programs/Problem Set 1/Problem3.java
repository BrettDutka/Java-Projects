public class Problem3 {
    public static String sortThreeStrings(String a, String b, String c){
        String first = a;
        String second = b;
        String third = c;

        if(b.compareTo(a) < 0){
            first = b;
            second = a;
        }

        if(c.compareTo(first) < 0){
            third = second;
            second = first;
            first = c;
        } else if (c.compareTo(second) < 0) {
            third = second;
            second = c;
        }

        return first + "," + second + "," + third;
    }
}
