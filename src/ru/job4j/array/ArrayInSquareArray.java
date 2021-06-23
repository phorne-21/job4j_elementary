package ru.job4j.array;

public class ArrayInSquareArray {

    public static int[][] convertArray(int[] array) {
        int leng;
        if (Math.sqrt(array.length) - (int) Math.sqrt(array.length) == 0) {
            leng = (int) Math.sqrt(array.length);
        } else {
            leng = (int) Math.sqrt(array.length) + 1;
        }
        int[][] cArray = new int[leng][leng];
        int l = 0;
        for (int row = 0; row < cArray.length; row++) {
            for (int cell = 0; cell < cArray[row].length; cell++) {
                if (l < array.length) {
                    cArray[row][cell] = array[l++];
                } else {
                    cArray[row][cell] = 0;
                }
            }
        }
        return cArray;
    }
}
