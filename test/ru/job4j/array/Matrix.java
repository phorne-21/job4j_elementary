package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[size - 1 - i][0] = size - i;
            array[0][size - 1 - i] = size - i;
            for (int j = 1; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);

            }
        }
        return array;
    }
}
