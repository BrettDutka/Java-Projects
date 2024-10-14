public class Problem8 {

    /**
     * Not operator
     * Returns opposite of the input
     *
     * @param p the input boolean
     * @return the boolean that is not or the opposite
     */
    public static boolean not(boolean p){
        return !p;
    }

    /**
     * AND
     * Returns true if both are true if not false
     *
     * @param p the first boolean
     * @param q second boolean
     * @return checks the and of the given
     */
    public static boolean and(boolean p, boolean q){
        return p && q;
    }

    /**
     * OR
     * Returns true if either is true and false if both are false
     *
     * @param p first boolean
     * @param q second boolean
     * @return true if either is true or false if both false
     */
    public static boolean or(boolean p, boolean q){
        return p || q;
    }

    /**
     * Will return false if p is true and q is false, or true
     * @param p first boolean
     * @param q second boolean
     * @return false if p true and q false, otherwise true
     */
    public static boolean cond(boolean p, boolean q){
        return !p || q;
    }

    /**
     * True if both booleans are true or both are false, false otherwise
     * @param p
     * @param q
     * @return true if botj are true or both are false, false otherwise
     */
    public static boolean bicond(boolean p, boolean q){
        return(p && q) || (!p && !q);
    }

}
