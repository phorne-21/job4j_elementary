package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String result;
        if (number % 2 == 0) {
            if (number % 3 == 0) {
                result = "Исходное число делится на 6.";
            } else {
                result = "Исходное число не делится на 3, но является четным.";
            }
        } else {
            if (number % 3 == 0) {
                result = "Исходное число делится на 3, но не является четным.";
            } else {
                result = "Исходное число не делится на 3 и не является четным.";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(DivideBySix.checkNumber(23));
        System.out.println(DivideBySix.checkNumber(6));
        System.out.println(DivideBySix.checkNumber(20));
        System.out.println(DivideBySix.checkNumber(3));
    }
}
