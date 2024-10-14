public class Problem2 {
    /**
     * Calculates total cost for grocery items purchased.
     * Applies the prices for the fruits per unit.
     *
     * @param a number of apples purchased
     * @param b number of bananas purchased
     * @param o number of oranges purchased
     * @param g number of the bunches of grapes purchased
     * @param p number of pineapples purchased
     * @return total cost for all items purchased
     */
    public static double grocery(int a, int b, int o, int g, int p){
        double apple = a * 0.59;
        double banana = b * 0.99;
        double orange = o * 0.45;
        double bunchOfGrapes = g * 1.39;
        double pineapple = p * 2.24;

        return apple + banana + orange + bunchOfGrapes + pineapple;
    }
}
