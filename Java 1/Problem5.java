public class Problem5 {
    /**
     * Gets the username from an email address
     *
     * @param email the given email
     * @return the name or user before the '@' symbol
     */
    public static String cutUsername(String email){
        int index = email.indexOf("@");
        return email.substring(0, index);
    }
}
