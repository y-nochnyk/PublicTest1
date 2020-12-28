import org.junit.Test;
import static org.junit.Assert.*;
import utils.StringReverser;

public class StringReverserTest {
    private static final String INPUT_STRING = "Hello World! !! !";
    private static final String EXPECTED_REVERSED_STRING = "! !! !dlroW olleH";
    private static final String INCORRECT_INPUT_WHITESPACE = "   ";
    private final StringReverser reverser = new StringReverser();

    @Test
    public void positiveTestForLazyReverse(){
        String actual = reverser.stringReverseLazy(INPUT_STRING);
        assertEquals("Expected: " + EXPECTED_REVERSED_STRING +
                "Actual: " + actual, EXPECTED_REVERSED_STRING, actual);
    }

    @Test
    public void positiveTestForLoopedReverse(){
        String actual = reverser.stringReverseLooped(INPUT_STRING);
        assertEquals("Expected: " + EXPECTED_REVERSED_STRING +
                "Actual: " + actual, EXPECTED_REVERSED_STRING, actual);
    }

    @Test
    public void positiveValidateInputTest(){
        assertTrue(reverser.validateInput(INPUT_STRING));
    }

    @Test(expected = IllegalArgumentException.class)
    public void negativeTestUsingIncorrectInputWhitespaces(){
        reverser.validateInput(INCORRECT_INPUT_WHITESPACE);
    }
}
