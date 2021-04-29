package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        value = value / 70;
        return value;
    }
    public static int rubleToDollar(int value) {
        value = value / 60;
        return value;
    }
    public static int euroToRuble(int value) {
        value = value * 70;
        return value;
    }
    public static int dollarToRuble(int value) {
        value = value * 60;
        return value;
    }
    public static int euroToDollar(int value) {
        value = (value * 70) / 60;
        return value;
    }
    public static int dollarToEuro(int value) {
        value = (value * 60) / 70;
        return value;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        euro = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " dollars.");
        euro = Converter.euroToRuble(10);
        System.out.println("10 euro are " + euro + " rubles.");
        euro = Converter.dollarToRuble(40);
        System.out.println("40 dollars are " + euro + " rubles.");
        euro = Converter.euroToDollar(140);
        System.out.println("140 euro are " + euro + " dollars.");
        euro = Converter.dollarToEuro(30);
        System.out.println("30 dollars are " + euro + " euro.");
    }
}