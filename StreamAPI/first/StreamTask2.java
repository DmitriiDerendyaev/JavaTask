import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamTask2 {

    public static void main(String[] args) {

        // 2. Создать список строк. Найти в списке все слова, длина которых больше 4 символов. Преобразовать их в верхний регистр и вывести в консоль.
//        List<String> words = List.of("Java", "Stream", "Lambda", "API", "Code", "Function");
//
//        words.stream()
//                .filter(word -> word.length() >= 4)
//                .map(String::toUpperCase)
//                .sorted()
//                .forEach(System.out::println);

        double[] values = {2.5, 1.2, 4.7, 3.3, 5.0};

        Arrays.stream(values)
                .map(m -> m * 1.1)
                .filter(n -> n > 4.0)
                .sorted(Comparator.reverseOrder())
                .forEach(n -> System.out.println(String.format("%.2f", n)));

    }
}
