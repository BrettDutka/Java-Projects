public class Problem1 {
    public static String userId(String f, String l, int y){
        String lastName = l.substring(0, Math.min(5, l.length()));
        String firstName = f.substring(0, 1);
        int year = y % 100;

        return lastName + firstName + year;
    }
}
