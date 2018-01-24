package tasks;

import java.util.Arrays;
import java.util.Random;

public class Example4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] mas = new int[5][5];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(20) + 1;
            }
            System.out.println(Arrays.toString(mas[i]));
        }
        System.out.println();
        System.out.println(Arrays.toString(linearize(mas)));
    }

    private static int[] linearize(int[][] massif) {
        int[] array = new int[massif.length * massif[0].length];
        int index = 0;
        for (int i = 0; i < massif.length; i++) {
            for (int j = 0; j < massif.length; j++) {
                array[index++] = massif[i][j];
            }
        }
        return array;
    }
}
