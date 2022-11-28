import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a1 = {0, 2, 2};
        int[] a2 = {1, 3};

        int[] result = new int [a1.length + a2.length];
        int idxOne = 0;
        int idxTwo = 0`;

        for (int i = 0; i < result.length; i++)
        {
            if (idxTwo >= a2.length || idxOne < a1.length && a1[idxOne] < a2[idxTwo]) {
                result[i] = a1[idxOne];
                idxOne++;
            } else {
                result[i] = a2[idxTwo];
                idxTwo++;
            }
        }

        System.out.println(Arrays.toString(result));

    }
}