import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BhmDatabaseTest {

  private static String[][] db = new String[][]{
          {"ID", "Name", "Age", "Occupation", "Salary"},
          {"1", "Katherine Johnson", "101", "Mathematician", "120000"},
          {"2", "Gladys West", "91", "Mathematician", "115000"},
          {"3", "Dorothy Vaughan", "98", "Mathematician", "110000"},
          {"4", "Evelyn Boyd Granville", "95", "Mathematician", "118000"},
  };


  @Test
  void testQuery() {
    String query = "SELECT * WHERE Occupation = 'Mathematician'";
    List<String> result = BhmDatabase.query(db, query);
    assertEquals(
            List.of("Katherine Johnson", "Gladys West", "Dorothy Vaughan", "Evelyn Boyd Granville"),
            result);
  }
}