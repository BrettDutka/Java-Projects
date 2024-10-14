import java.util.ArrayList;

class Problem5 {

    /**
     * Splits given string into tokens based on delimiters.
     * @param s given to be tokenized
     * @param d delimiter for tokenization
     * @return An ArrayList of string tokens split at the delimiter
     */
    static ArrayList<String> tokenize(String s, char d){
        ArrayList<String> tokens = new ArrayList<>();
        StringBuilder token = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char current = s.charAt(i);
            if(current == d){
                if(token.length() > 0){
                    tokens.add(token.toString());
                    token = new StringBuilder();
                }
            } else{
                token.append(current);
            }
        }
        if(token.length() > 0){
            tokens.add(token.toString());
        }
        return tokens;
    }
}
