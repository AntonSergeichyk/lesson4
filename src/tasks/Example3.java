package tasks;
import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        int[] array1 = new int[]{10, 20, 11, 22, 30, 33};
        int[] array2 = new int[]{44, 55, 66};
        System.out.println(Arrays.toString(createArray(array1, array2)));
    }

    private static int[] createArray(int[] array1, int[] array2) {
        int[] resultArray = new int[array1.length + array2.length];
        int index = 0;
        for (int i = 0; i < resultArray.length; i++) {
            if (i < array1.length) {
                resultArray[i] = array1[i];
            } else {
                resultArray[i] = array2[index++];
            }
        }
        return resultArray;
    }
}
