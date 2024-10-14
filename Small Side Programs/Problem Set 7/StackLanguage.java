import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class StackLanguage {
  private Map<String, Double> variables;
  private Stack<Double> stack;

  public StackLanguage() {
    variables = new HashMap<>();
    stack = new Stack<>();
  }

  public void readFile(String fileName) {
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = reader.readLine()) != null) {
        String[] parts = line.split(" ");
        switch (parts[0]) {
          case "DECL":
            declareVariable(parts[1], Double.parseDouble(parts[2]));
            break;
          case "PUSH":
            pushToStack(Double.parseDouble(parts[1]));
            break;
          case "POP":
            popFromStack(parts[1]);
            break;
          case "PEEK":
            peekStack(parts[1]);
            break;
          case "ADD":
            add(Double.parseDouble(parts[1]));
            break;
          case "SUB":
            subtract(Double.parseDouble(parts[1]));
            break;
          case "XCHG":
            exchange(parts[1]);
            break;
          case "DUP":
            duplicateTopStack();
            break;
          default:
            throw new UnsupportedOperationException("Unsupported operation: " + parts[0]);
        }
      }
    } catch (IOException e) {
      System.out.println("Error: Failed to read the file.");
    } catch (IllegalArgumentException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }

  public double interpret() {
    if (stack.isEmpty()) {
      throw new IllegalStateException("No instructions have been read.");
    }
    return stack.peek();
  }

  private void declareVariable(String name, double value) {
    variables.put(name, value);
  }

  private void pushToStack(double value) {
    stack.push(value);
  }

  private void popFromStack(String name) {
    if (!variables.containsKey(name)) {
      throw new IllegalArgumentException("Variable " + name + " has not been declared.");
    }
    variables.put(name, stack.pop());
  }

  private void peekStack(String name) {
    if (!variables.containsKey(name)) {
      throw new IllegalArgumentException("Variable " + name + " has not been declared.");
    }
    variables.put(name, stack.peek());
  }

  private void add(double value) {
    stack.push(stack.pop() + value);
  }

  private void subtract(double value) {
    stack.push(stack.pop() - value);
  }

  private void exchange(String name) {
    if (!variables.containsKey(name)) {
      throw new IllegalArgumentException("Variable " + name + " has not been declared.");
    }
    double temp = stack.pop();
    stack.push(variables.get(name));
    variables.put(name, temp);
  }

  private void duplicateTopStack() {
    double top = stack.peek();
    stack.push(top);
  }
}