import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class BraceCheckerTests {

    private BraceChecker checker = new BraceChecker();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("(){}[]"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, checker.isValid("[(])"));
    }

//    @Test
//    public void testEmoValid() {
//        assertEquals(false, checker.isValid("\uD83D\uDC49\uD83C\uDFFB\uD83D\uDC49\uD83C\uDFFB\uD83D\uDC48\uD83C\uDFFB\uD83D\uDC48\uD83C\uDFFB"));
//    }
//    @Test
//    public void testEmoInValid() {
//        assertEquals(true, checker.isValid("👉👈"));
//    }



}