import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;

import static org.junit.Assert.*;

public class EchoOddsTest {
    @Test
    public void testEchoOdds_ValidInput() {
        String inputFile = "file1a.in";
        EchoOdds.echoOdds(inputFile);
        assertOutputFileContents(inputFile.replace(".in", ".out"), "5\n25\n17\n13\n");
    }

    @Test(expected = InputMismatchException.class)
    public void testEchoOdds_InvalidInput() {
        String inputFile = "file1b.in";
        EchoOdds.echoOdds(inputFile);
    }

    private void assertOutputFileContents(String fileName, String expected) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            assertEquals(expected, sb.toString());
        } catch (IOException e) {
            fail("Failed to read output file: " + fileName);
        }
    }
}