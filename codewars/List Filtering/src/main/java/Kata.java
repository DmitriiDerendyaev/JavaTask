import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {

    public static List<Object> filterList(final List<Object> list) {
        Set<Object> filteredSet = new HashSet<Object>();
        Pattern pattern = Pattern.compile("^\\d+\\b");
        for (Object o : list) {
            Matcher matcher = pattern.matcher(o.toString());
            if (matcher.find()) {
                filteredSet.add(o);
            }
        }
        return Arrays.asList(filteredSet.toArray());
    }
}
