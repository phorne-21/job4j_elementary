package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int le = 0;
        int ri = 0;
        int i = 0;
        while (le < left.length && ri < right.length) {
            result[i++] = left[le] < right[ri] ? left[le++] : right[ri++];
        }
        while (le < left.length) {
            result[i++] = left[le++];
        }
        while (ri < right.length) {
            result[i++] = right[ri++];
        }
        return result;
    }
}
