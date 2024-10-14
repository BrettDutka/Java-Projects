public class Problem8 {

    /**
     * Approximates area of circle using Riemann rectangle summation.
     * Gets the area of one quadrant using right Riemann approximation.
     * @param r circle radius
     * @param delta width of rectangle
     * @return approximated circle area
     */
    public static double circleArea(double r, double delta){
        double x = 0;
        double area = 0;

        while(x < r){
            double h = Math.sqrt(r * r - x * x);
            area += h * delta;
                    x += delta;
        }
        return area * 4;
    }
}
