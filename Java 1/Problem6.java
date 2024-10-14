public class Problem6 {

    /**
     * Gets the sum of the three rounded x, y, z.
     * Rounds the number up or down depending on its value.
     *
     * @param x first integer
     * @param y second integer
     * @param z third integer
     * @return the sum of the rounded values of x, y, z
     */
    public static int computeRoundSum(int x, int y, int z){
        // Round x
        int xRounded;
        if(x < 0){
            xRounded = (x / 10) * 10;
        } else{
            xRounded = ((x + 5) / 10) * 10;
        }

        // Round y
        int yRounded;
        if(y < 0){
            yRounded = (y / 10) * 10;
        } else{
            yRounded = ((y + 5) / 10) * 10;
        }

        // Round z
        int zRounded;
        if(z < 0){
            zRounded = (z / 10) * 10;
        } else{
            zRounded = ((z + 5) / 10 * 10);
        }

        return xRounded + yRounded + zRounded;
    }
}
