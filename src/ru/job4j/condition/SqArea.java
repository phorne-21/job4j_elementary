package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double rsl = (double) p / 2 / (k +1);
        rsl = ((double) p / 2 - rsl) * rsl;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result1);
    }
}
