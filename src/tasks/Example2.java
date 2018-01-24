package tasks;

import java.util.Arrays;
import java.util.Random;

public class Example2 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(30) + 1;
        }
        System.out.println(Arrays.toString(array));
        deletingElements(array);
        System.out.println(Arrays.toString(array));
    }

    private static void deletingElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                }
            }
        }
    }
}
