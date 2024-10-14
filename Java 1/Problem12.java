public class Problem12 {
    /**
     * Determines the state of matter based on temperature and unit
     *
     * @param t water temperature
     * @param u temperature unit 'C' for Celsius or 'F' for Fahrenheit
     * @return whether it is liquid solid or gas
     */
    public static String stateOfMatter(double t, char u){
        double celsius;
        if(u == 'C'){
            celsius = t;
        } else{
            celsius = (t - 32) * 5 / 9;
        }
        if(celsius <= 0){
            return "Solid";
        } else if(celsius >= 100){
            return "Gas";
        } else{
            return "Liquid";
        }
    }
}
