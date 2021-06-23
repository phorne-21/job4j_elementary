package ru.job4j.condition;

public class SqArea {
    public static double square(int perimeter, double coefficient) {
        double height = perimeter / (2 * (coefficient + 1));
        double length = height * coefficient;
        return length * height;
    }

    public static void main(String[] args) {
        int perimeter = 6;
        double coefficient = 2.00;
        double result1 = SqArea.square(perimeter, coefficient);
        System.out.println(" p = " + perimeter + ", k = " + coefficient + ", s = 2, real = " + result1);
    }
}
