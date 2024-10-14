import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class Problem8 {

    /**
     * Evaluates postfix notation expression
     * @param l given list of strings that represents operators and (+, -, /, *)
     * @return The result of evaluating the postfix notation expression.
     */
    static double postfixEvaluator(List<String> l) {
        Stack<Double> stack = new Stack<>();
        for(String i : l){
            if(binaryOp(i)){
                double second = stack.pop();
                double first = stack.pop();
                stack.push(applyOp(first, second, i));
            } else{
                stack.push(Double.parseDouble(i));
            }
        }
        return stack.pop();
    }

    /**
     * Checks if a given string is a binary operator (+, -, *, /)
     * @param s string to check
     * @return True if there is a binary operator and if there is none false.
     */
    private static boolean binaryOp(String s){
        return "+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s);
    }

    /**
     * Applies the operator to integer a and integer b
     * @param a first num
     * @param b second num
     * @param op the operator
     * @return The result of adding, subtracting, multiplying, or dividing nums
     */
    private static double applyOp(double a, double b, String op){
        switch(op){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
        }
        return 0;
    }

}
