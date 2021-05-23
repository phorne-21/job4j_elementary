package ru.job4j.array;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] tryArray = new int[5];
        for (int index = 0; index < tryArray.length; index++) {
            tryArray[index] = index * 2 + 3;
        }
        for (int j : tryArray) {
            System.out.println(j);
        }
    }
}
