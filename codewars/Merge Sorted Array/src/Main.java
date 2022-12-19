import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] first = {1,2,3,0,0,0};
        int[] second = {2,5,6};
        System.out.println(Arrays.toString(Solution.merge(first, 3, second, 3)));
    }
}