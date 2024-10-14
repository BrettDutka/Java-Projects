public class Problem1 {

    /**
     * Converts distance in gigameters to lightseconds.
     * @param gm distance in gigameters turned into lightseconds.
     * @return how long light takes to travel to the given.
     */
    public static double gigameterToLightsecond(double gm){
        double metersPerGigameter = 1_000_000_000;
        double speedOfLightMs = 299792458;

        double gigameterInMeters = gm * metersPerGigameter;

        return gigameterInMeters / speedOfLightMs;
    }
}
