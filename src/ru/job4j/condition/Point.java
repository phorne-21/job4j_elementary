package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = (double) x2 - (double) x1;
        double rsl2 = (double) y2 - (double) y1;
        rsl = Math.pow(rsl, 2) + Math.pow(rsl2, 2);
        rsl = Math.sqrt(rsl);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
