public class Problem7 {
    /**
     * Checks if one of the three integers is less than 20 away from another.
     *
     * @param x first int
     * @param y second int
     * @param z third int
     * @return true if one of the integers is less than 20 away from another or it will return false
     */

    public static boolean lessThan20(int x, int y, int z){
        // Checking Difference
        int xDifference = Math.abs(x - y);
        int yDifference = Math.abs(y - z);
        int zDifference = Math.abs(z - x);

        return (xDifference < 20) || (yDifference < 20) || (zDifference < 20);
    }
}
