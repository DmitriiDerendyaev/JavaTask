import java.util.Arrays;

public class Solution {
    public static int[] deleteFirstElem(int[] arr){
        for(int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }

        return arr;
    }

    public static int[] deleteFirstNew(int[] arr){
        int[] newArray = new int[arr.length-1];
        for(int i = 1; i < arr.length; i++){
            newArray[i-1] = arr[i];
        }

        return newArray;
    }

    public static int[] deleteElemIndex(int[] arr, int index){
        int[] newArray = new int[arr.length-1];
        for(int i = index; i < arr.length; i++){
            arr[i-1] = arr[i];
        }

        newArray = Arrays.copyOfRange(arr, 0, arr.length - 1);

        return newArray;
    }
}
