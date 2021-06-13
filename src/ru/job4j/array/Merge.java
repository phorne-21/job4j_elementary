package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int le = 0;
        int ri = 0;
        int i = 0;
        while (le < left.length && ri < right.length) {
            rsl[i++] = left[le] < right[ri] ? left[le++] : right[ri++];
        }
        while (le < left.length) {
            rsl[i++] = left[le++];
        }
        while (ri < right.length) {
            rsl[i++] = right[ri++];
        }
        return rsl;
    }
}
