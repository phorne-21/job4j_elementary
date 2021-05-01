package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenHight170ThenM80a5W69a0() {
        short height = 170;
        double outMan = Fit.manWeight(height);
        double outWoman = Fit.womanWeight(height);
        double expMan = 80.5;
        double expWom = 69.0;
        Assert.assertEquals(expMan, outMan, 0.01);
        Assert.assertEquals(expWom, outWoman, 0.01);
    }

    @Test
    public void whenHight185ThenM97a75W86a25() {
        short height = 185;
        double outMan = Fit.manWeight(height);
        double outWoman = Fit.womanWeight(height);
        double expMan = 97.75;
        double expWom = 86.25;
        Assert.assertEquals(expMan, outMan, 0.01);
        Assert.assertEquals(expWom, outWoman, 0.01);
    }

    @Test
    public void whenHight200ThenM114a99W103a49() {
        short height = 200;
        double outMan = Fit.manWeight(height);
        double outWoman = Fit.womanWeight(height);
        double expMan = 114.99;
        double expWom = 103.49;
        Assert.assertEquals(expMan, outMan, 0.01);
        Assert.assertEquals(expWom, outWoman, 0.01);
    }

    @Test
    public void whenHight168ThenM78a19W66a69() {
        short height = 168;
        double outMan = Fit.manWeight(height);
        double outWoman = Fit.womanWeight(height);
        double expMan = 78.19;
        double expWom = 66.69;
        Assert.assertEquals(expMan, outMan, 0.01);
        Assert.assertEquals(expWom, outWoman, 0.01);
    }
}