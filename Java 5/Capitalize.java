import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

class Capitalize {

  /**
   * Reads a text file then it will capitalize the first letter of each sentence. Then writes it into a new file with the same name but now .out
   *
   * @param in the path to the given file that has the text that will be capitalized.
   */
  static void capitalize(String in) {
    String out = in.substring(0, in.lastIndexOf('.')) + ".out";
    try(BufferedReader readF = new BufferedReader(new FileReader(in));
        BufferedWriter writeF = new BufferedWriter(new FileWriter(out))){
      String line;
      StringBuilder sb = new StringBuilder();
      boolean first = true;
      while((line = readF.readLine()) != null){
        sb.append(line);
        if(readF.ready()){
          sb.append("\n");
        }
      }
        char[] letters = sb.toString().toCharArray();
        StringBuilder ans = new StringBuilder();
        for(char c : letters){
          if(first && Character.isLetter(c)){
            ans.append(Character.toUpperCase(c));
            first = false;
          }else{
            ans.append(c);
          }
          if(c == '.')
            first = true;
        }
        writeF.write(ans.toString());
        writeF.newLine();
    }
    catch(IOException e){
      System.err.println("Error: " + e.getMessage());
    }
  }
}
