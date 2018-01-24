package tasks;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] array = new int[]{13, 10, 6, 9, 22};
        for (int i = 0; i < 5; i++) {
            cyclicShift(array);
            System.out.println(Arrays.toString(array));
        }
    }
    private static void cyclicShift(int[] array) {
        int lastElement = array[array.length-1];
        for (int j = array.length - 1; j > 0; j--) {
            array[j] = array[j - 1];
        }
        array[0] = lastElement;
    }
}

