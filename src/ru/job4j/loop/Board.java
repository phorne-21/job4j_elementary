package ru.job4j.loop;

public class Board {
    public static void paint(int widht, int height) {
        for (int row = 1; row <= height; row++) {
            for (int cell = 1; cell <= widht; cell++) {
                if ((cell + row) % 2 == 0) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public  static void main(String[] args) {
        Board.paint(3, 3);
        System.out.println();
        Board.paint(4, 4);
    }
}
