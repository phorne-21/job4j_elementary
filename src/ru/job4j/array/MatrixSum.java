package ru.job4j.array;

public class MatrixSum {
    @SuppressWarnings("checkstyle:NeedBraces")
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                rsl = rsl + anInt;
            }
        }
        return rsl;
    }
}
