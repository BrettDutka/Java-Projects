import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class StackLanguageTest {
    @Test
    public void testReadFile_ValidInput() {
        StackLanguage stackLanguage = new StackLanguage();
        stackLanguage.readFile("test_input.txt");
        double result = stackLanguage.interpret();
        assertEquals(12.0, result, 0.001);
    }

    @Test(expected = IllegalStateException.class)
    public void testInterpret_NoInstructionsRead() {
        StackLanguage stackLanguage = new StackLanguage();
        stackLanguage.interpret();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReadFile_UndeclaredVariable() {
        StackLanguage stackLanguage = new StackLanguage();
        stackLanguage.readFile("test_input_undeclared.txt");
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testReadFile_UnsupportedOperation() {
        StackLanguage stackLanguage = new StackLanguage();
        stackLanguage.readFile("test_input_unsupported.txt");
    }

}