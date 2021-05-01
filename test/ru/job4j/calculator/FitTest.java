package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenHight170ThenM80a5() {
        short height = 170;
        double outMan = Fit.manWeight(height);
        double expMan = 80.5;
        Assert.assertEquals(expMan, outMan, 0.01);
    }

    @Test
    public void whenHight185ThenM97a75() {
        short height = 185;
        double outMan = Fit.manWeight(height);
        double expMan = 97.75;
        Assert.assertEquals(expMan, outMan, 0.01);
    }

    @Test
    public void whenHight200ThenM114a99() {
        short height = 200;
        double outMan = Fit.manWeight(height);
        double expMan = 114.99;
        Assert.assertEquals(expMan, outMan, 0.01);
    }

    @Test
    public void whenHight168ThenM78a19() {
        short height = 168;
        double outMan = Fit.manWeight(height);
        double expMan = 78.19;
        Assert.assertEquals(expMan, outMan, 0.01);
    }

    @Test
    public void whenHight170ThenW69a0() {
        short height = 170;
        double outWoman = Fit.womanWeight(height);
        double expWom = 69.0;
        Assert.assertEquals(expWom, outWoman, 0.01);
    }

    @Test
    public void whenHight185ThenW86a25() {
        short height = 185;
        double outWoman = Fit.womanWeight(height);
        double expWom = 86.25;
        Assert.assertEquals(expWom, outWoman, 0.01);
    }

    @Test
    public void whenHight200ThenW103a49() {
        short height = 200;
        double outWoman = Fit.womanWeight(height);
        double expWom = 103.49;
        Assert.assertEquals(expWom, outWoman, 0.01);
    }

    @Test
    public void whenHight168ThenW66a69() {
        short height = 168;
        double outWoman = Fit.womanWeight(height);
        double expWom = 66.69;
        Assert.assertEquals(expWom, outWoman, 0.01);
    }
}