import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals("negative numbers aren't square numbers", false, Main.isSquare(-1));
        assertEquals("0 is a square number (0 * 0)",    true,   Main.isSquare(0));
        assertEquals("3 isn't a square number", false,  Main.isSquare(3));
        assertEquals("4 is a square number (2 * 2)",    true,   Main.isSquare(4));
        assertEquals("25 is a square number (5 * 5)",   true,   Main.isSquare(25));
        assertEquals("33914752 isn't a square number",false,  Main.isSquare(33914752 ));
    }
}