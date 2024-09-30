import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {

    public static List<Object> filterList(final List<Object> list) {
        Set<Object> filteredSet = new HashSet<>();
        for (Object o : list) {
            if (o instanceof Integer) {
                filteredSet.add(o);
            }
        }
        return Arrays.asList(filteredSet.toArray());
    }
}
