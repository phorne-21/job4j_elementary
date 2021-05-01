package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double exp = 2.0;
        double result = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(exp, result, 0.01);
    }

    @Test
    public void when13to75Then6a32() {
        int x1 = 1;
        int y1 = 3;
        int x2 = 7;
        int y2 = 5;
        double exp = 6.32;
        double result = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(exp, result, 0.01);
    }

    @Test
    public void when23to41Then2a82() {
        int x1 = 2;
        int y1 = 3;
        int x2 = 4;
        int y2 = 1;
        double exp = 2.82;
        double result = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(exp, result, 0.01);
    }

    @Test
    public void when11to11Then0() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 1;
        int y2 = 1;
        double exp = 0.00;
        double result = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(exp, result, 0.01);
    }
}