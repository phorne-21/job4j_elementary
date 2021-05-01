package ru.job4j.condition;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP12K2Then8() {
        int p = 12;
        double k = 2;
        double expS = 8;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expS, rsl, 0.01);
    }

    @Test
    public void whenP32K1Then64() {
        int p = 32;
        double k = 1;
        double expS = 64;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expS, rsl, 0.01);
    }

    @Test
    public void whenP24K5Then20() {
        int p = 24;
        double k = 5;
        double expS = 20;
        double rsl = SqArea.square(p, k);
        Assert.assertEquals(expS, rsl, 0.01);
    }
}