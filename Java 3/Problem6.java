import java.util.HashMap;

class Problem6 {

    /**
     * Count the number of occurrences of each word in given string with everything removed besides just the word.
     * @param s given string
     * @return A Hashmap with words as keys and their count as the values.
     */
    static HashMap<String, Integer> wordCount(String s){
        String clean = s.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
        String[] w = clean.split("\\s+");
        HashMap<String, Integer> count = new HashMap<>();
        for(String l : w){
            if(!l.trim().isEmpty()){
                count.put(l, count.getOrDefault(l, 0) + 1);
            }
        }
        return count;
    }
}
