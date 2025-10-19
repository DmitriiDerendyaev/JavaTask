import java.util.List;

public class StreamTask1 {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(3, 10, 7, 22, 5, 8, 1);

        numbers.stream()
                .filter(n -> n > 5)
                .map(n -> n * 2)
                .sorted()
                .forEach(System.out::println);

    }
}
