package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static int euroToDollar(int value) {
        return value * 70 / 60;
    }

    public static int dollarToEuro(int value) {
        return value * 60 / 70;
    }

    public static void main(String[] args) {
        int money = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + money + " euro.");
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        money = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + money + " dollars.");
        in = 120;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("120 rubles are 2. Test result : " + passed);
        money = Converter.euroToRuble(10);
        System.out.println("10 euro are " + money + " rubles.");
        in = 10;
        expected = 700;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("10 euro are 700. Test result : " + passed);
        money = Converter.dollarToRuble(40);
        System.out.println("40 dollars are " + money + " rubles.");
        in = 40;
        expected = 2400;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("40 dollars are 2400. Test result : " + passed);
        money = Converter.euroToDollar(60);
        System.out.println("60 euro are " + money + " dollars.");
        in = 60;
        expected = 70;
        out = Converter.euroToDollar(in);
        passed = expected == out;
        System.out.println("60 euro are 70. Test result : " + passed);
        money = Converter.dollarToEuro(70);
        System.out.println("70 dollars are " + money + " euro.");
        in = 70;
        expected = 60;
        out = Converter.dollarToEuro(in);
        passed = expected == out;
        System.out.println("70 dollars are 60. Test result : " + passed);
    }
}
