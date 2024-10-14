import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EchoOdds {
  public static void echoOdds(String fileName) {
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName));
         BufferedWriter writer = new BufferedWriter(new FileWriter(fileName.replace(".in", ".out")))) {
      Scanner scanner = new Scanner(reader);
      while (scanner.hasNextInt()) {
        int num = scanner.nextInt();
        if (num % 2 != 0) {
          writer.write(num + "\n");
        }
      }
      writer.write("\n");
    } catch (InputMismatchException e) {
      System.out.println("Error: Non-integer value found in the input file.");
    } catch (IOException e) {
      System.out.println("Error: Failed to read or write the file.");
    }
  }
}