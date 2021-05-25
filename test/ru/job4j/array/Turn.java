package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int number;
        for (int index = 0; index < array.length / 2; index++) {
            number = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = number;
        }
        return array;
    }
}

