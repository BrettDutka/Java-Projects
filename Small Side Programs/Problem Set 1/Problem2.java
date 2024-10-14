public class Problem2 {
    public static double computeGpa(String grade){
        double gpa = 0;

        switch(grade){
            case "A+":
                gpa = 4.0;
                break;
            case "A":
                gpa = 4.0;
                break;
            case "A-":
                gpa = 3.7;
                break;
            case "B+":
                gpa = 3.3;
                break;
            case "B":
                gpa = 3.0;
                break;
            case "B-":
                gpa = 2.7;
                break;
            case "C+":
                gpa = 2.3;
                break;
            case "C":
                gpa = 2.0;
                break;
            case "C-":
                gpa = 1.7;
                break;
            case "D+":
                gpa = 1.3;
                break;
            case "D":
                gpa = 1.0;
                break;
            case "D-":
                gpa = 0.7;
                break;
            default:
                gpa = 0;
        }

        return gpa;
    }
}
