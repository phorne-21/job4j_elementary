package ru.job4j.condition;

public class ChessBoard {
    @SuppressWarnings("checkstyle:EmptyBlock")
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = Math.abs(x1 - x2);
        rsl = rsl == Math.abs(y1 - y2) ? rsl : 0;
        rsl = (x1 < 0 || x2 < 0 || y1 < 0 || y2 < 0) ? 0 : rsl;
        rsl = (x1 > 7 || x2 > 7 || y1 > 7 || y2 > 7) ? 0 : rsl;
        return rsl;
    }
}
