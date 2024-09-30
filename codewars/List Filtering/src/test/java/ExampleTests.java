import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTests {

    @Test
    @DisplayName("Базовый тест")
    public void examplesBase() {
        assertEquals(List.of(1, 2), Kata.filterList(List.of(1, 2, "a", "b")), "For input: [1, 2, \"a\", \"b\"]");
    }

    @Test
    @DisplayName("Сортировка")
    public void examplesExpanded() {
        assertEquals(List.of(0, 1, 15), Kata.filterList(List.of(1, "a", "b", 0, 15)), "For input: [1, \"a\", \"b\", 0, 15]");
    }

    @Test
    @DisplayName("Сортировка и особые условия")
    public void examplesExpandedInteger() {
        assertEquals(List.of(1, 2, 123), Kata.filterList(List.of(1, 2, "aasf", "1", "123", 123)), "For input: [1, 2, \"aasf\", \"1\", \"123\", 123]");
    }
}