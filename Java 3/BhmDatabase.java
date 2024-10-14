import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BhmDatabase {

  /**
   * Handles an input query. Delegates this to the
   * handleSelectQuery method.
   * @param db - 2D array of info.
   * @param query - query to make.
   * @return results of query.
   */
  static List<String> query(String[][] db, String query) {
    return handleSelectQuery(db, query);
  }
  /**
   * Handles a SELECT query and returns the result of the query.
   *
   * SELECT <n> WHERE <predicate>
   *
   * A Predicate is one of:
   * - <header> <comparator> <value>
   *
   * A Comparator is one of:
   * - =
   * - !=
   * - >
   * - <
   * - >=
   * - <=
   * - LIKE
   *
   * A Value is one of:
   * - 'Number'
   * - 'String'
   * - '%String'
   * - 'String%'
   * - '%String%'
   *
   * @param db - the database to query.
   * @param query - the query to execute.
   * @return the result of the query.
   */
  private static List<String> handleSelectQuery(String[][] db, String query){
    String[] qp = query.split(" ", 4);
    String sp = qp[1];
    String p = qp[3];

    String[] predPart = p.split(" ", 3);
    String header = predPart[0];
    String comp = predPart[1];
    String val = predPart[2].replaceAll("'", "");

    int headerIdx = headerIndex(db[0], header);
    if(headerIdx == -1){
      return new ArrayList<>();
    }

    List<String> ans = new ArrayList<>();
    for(int i = 1; i < db.length; i++){
      if(predMatch(db[i][headerIdx], comp, val)){
        ans.add(db[i][1]);
      }
    }
    if(!sp.equals("*")){
      int tmp = Integer.parseInt(sp);
      return ans.subList(0, Math.min(tmp, ans.size()));

    }
    return ans;
  }

  private static int headerIndex(String[] headers, String header){
    for(int i = 0; i < headers.length; i++){
      if(headers[i].equals(header)){
        return i;
      }
    }
    return -1;
  }

  private static boolean predMatch(String acc, String comp, String val){
    boolean x = false;
    switch(comp){
      case "=":
        x = acc.equals(val);
        break;
      case "!=":
        x = !acc.equals(val);
        break;
      case "<":
        x = Integer.parseInt(acc) < Integer.parseInt(val);
        break;
      case "<=":
        x = Integer.parseInt(acc) <= Integer.parseInt(val);
        break;
      case ">":
        x = Integer.parseInt(acc) > Integer.parseInt(val);
        break;
      case ">=":
        x = Integer.parseInt(acc) >= Integer.parseInt(val);
        break;
      case "LIKE":
        x = likePredMatch(acc, val);
        break;
      default:
        x = false;
        break;
    }
    return x;
  }
  private static boolean likePredMatch(String acc, String pa){
    if(pa.startsWith("%") && pa.endsWith("%")){
      return acc.contains(pa.substring(1, pa.length() - 1));
    } else if(pa.startsWith("%")){
      return acc.endsWith(pa.substring(1));
    } else if(pa.endsWith("%")){
      return acc.startsWith(pa.substring(0, pa.length() - 1));
    }else{
      return acc.equals(pa);
    }
  }
}
