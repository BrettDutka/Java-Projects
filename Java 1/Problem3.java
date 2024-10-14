public class Problem3 {
    /**
     * Calculates surface area of pyramid with the given
     * @param l length of pyramid base
     * @param w width of pyramid base
     * @param h height of pyramid
     * @return the total surface area of the base plus the lateral area
     */
    public static double pyramidSurfaceArea(double l, double w, double h){
        double base = l * w;
        double length = l * Math.sqrt((w/2) * (w/2) + h * h);
        double width = w * Math.sqrt((l/2) * (l/2) + h * h);

        return base + length + width;
    }
}
