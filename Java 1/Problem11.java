public class Problem11 {
    /**
     * Checks if given is a valid Ipv4 address
     *
     * @param ip ip to validate
     * @return True if valid IPv4 format, false otherwise
     */
    public static boolean isValidIpv4(String ip){
        if(ip == null)
            return false;

//        String[] octets = ip.split("\\.");
//
//        for(String octet : octets){
//            if(octet.matches(".*[a-zA-z].*")){
//                return false;
//            }
//        }

        String octet1 = ip.split("\\.")[0];
        String octet2 = ip.split("\\.")[1];
        String octet3 = ip.split("\\.")[2];
        String octet4 = ip.split("\\.")[3];

        if(octet1.matches(".*[a-zA-z].*"))
            return false;

        if(octet2.matches(".*[a-zA-z].*"))
            return false;

        if(octet3.matches(".*[a-zA-z].*"))
            return false;

        if(octet4.matches(".*[a-zA-z].*"))
            return false;


//        if(octet1.indexOf((int)'a') != -1)
//            return false;
//        if(octet2.indexOf((int)'z') != -1)
//            return false;
//        if(octet3.lastIndexOf((int)'A') != -1)
//            return false;
//        if(octet4.lastIndexOf((int)'Z') != -1)
//            return false;

        int octet1Num = Integer.parseInt(octet1);
        int octet2Num = Integer.parseInt(octet2);
        int octet3Num = Integer.parseInt(octet3);
        int octet4Num = Integer.parseInt(octet4);

        if(octet1Num < 0 || octet1Num > 255)
            return false;

        if(octet2Num < 0 || octet2Num > 255)
            return false;

        if(octet3Num < 0 || octet3Num > 255)
            return false;

        if(octet4Num < 0 || octet4Num > 255)
            return false;

        return true;
    }
}
