package ru.job4j.condition;

public class Cinema2 {
    public static void permission(boolean allow, boolean money) {
        if (allow && money) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Cinema2.permission(true, true);
        Cinema2.permission(true, false);
        Cinema2.permission(false, true);
        Cinema2.permission(false, false);
    }
}
