import java.util.ArrayList;
import java.util.List;

public class BraceChecker {

    public boolean isValid(String braces) {
        List tracer = new ArrayList();

        for(int i = 0; i < braces.length(); i++){
            if(braces.charAt(i) == '(' || braces.charAt(i) == '[' || braces.charAt(i) == '{'){
                tracer.add(braces.charAt(i));
            } else {
                if(tracer.size() == 0) return false;
                char lastValue = (char)tracer.get(tracer.size()-1);
                if((braces.charAt(i) == ']' && lastValue == '[') || (braces.charAt(i) == '}' && lastValue == '{') ||
                        (braces.charAt(i) == ')' && lastValue == '(')){
                    tracer.remove(tracer.size()-1);
                } else {
                    break;
                }
            }
        }
        return tracer.size() == 0;
    }

}