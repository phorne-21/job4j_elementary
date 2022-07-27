package ru.job4j.calculator;

public class Calculator {

    private static int x = 5;

    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int div = six / two;
        int minus = five - two;
        int time = four * two;
        int plus = one + two;
        System.out.println(plus);
        System.out.println(div);
        System.out.println(minus);
        System.out.println(time);
    }

    public  static int sum(int num) {
        return x + num;
    }

    public int multiply(int num) {
        return num * x;
    }

    public static int minus(int num) {
        return num - x;
    }

    public int divide(int num) {
        return  num / x;
    }

    public int sumAllOperation(int num) {
        return sum(num) + multiply(num) + minus(num) + divide(num);
    }
}
