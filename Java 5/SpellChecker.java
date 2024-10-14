import java.io.*;
import java.util.HashSet;
import java.util.Set;

class SpellChecker {

  /**
   * TODO.
   *
   * @param dict
   * @param in
   */
  static void spellCheck(String dict, String in) {
    Set<String> dictWords = new HashSet<>();

    try(BufferedReader readDict = new BufferedReader(new FileReader(dict))){
      String word;
      while((word = readDict.readLine()) != null){
        dictWords.add(word.toLowerCase());
      }
    }catch (IOException e){
      System.err.println("Error reading dictionary file: " + e.getMessage());
      return;
    }
    String outFilename = in.substring(0, in.lastIndexOf('.')) + ".out";
    try(BufferedReader fileReader = new BufferedReader(new FileReader(in));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(outFilename))) {

      String line = fileReader.readLine();
      if(line != null){
        StringBuilder ans = new StringBuilder();
        String[] words = line.split(" ");

        for(String word : words){
          if(!dictWords.contains(word.toLowerCase())){
            ans.append("[").append(word).append("]");
          } else{
            ans.append(word);
          }
          ans.append(" ");
        }

        fileWriter.write(ans.toString().trim());
        fileWriter.newLine();
      }
    } catch (IOException e){
      System.err.println("Error processing input file: " + e.getMessage());
    }
  }
}
