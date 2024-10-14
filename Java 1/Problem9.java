public class Problem9 {
    /**
     * Checks if a point (px, py) is inside a circle (cx, cy) and radius r
     * @param cx x-coordinate of circle center
     * @param cy y-coordinate of circle center
     * @param r circle radius
     * @param px x-coordinate of point
     * @param py y-coordinate of point
     * @return true if point is inside circle, false otherwise
     */
    public static boolean isInsideCircle(double cx, double cy, double r, double px, double py){
        double dist = Math.sqrt(Math.pow(px - cx, 2) + Math.pow(py - cy, 2));

        return(dist < r);
    }
}
