import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};
        int[] newArrays = {1,2,3,4,5};
        int[] byIndexArrays = {1,2,3,4,5};

        System.out.println(Arrays.toString(Solution.deleteFirstElem(arrays)));
        System.out.println(Arrays.toString(Solution.deleteFirstNew(newArrays)));
        System.out.println(Arrays.toString(Solution.deleteElemIndex(byIndexArrays, 3)));
    }
}