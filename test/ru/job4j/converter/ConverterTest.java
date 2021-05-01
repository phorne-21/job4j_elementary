package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;
import junit.framework.TestCase;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        int in = 180;
        int expected = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert10EuroThen700Rbl() {
        int in = 10;
        int expected = 700;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert40DlrThen2400Rbl() {
        int in = 40;
        int expected = 2400;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert60EuroThen70Dlr() {
        int in = 60;
        int expected = 70;
        int out = Converter.euroToDollar(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert70DlrThen60Euro() {
        int in = 70;
        int expected = 60;
        int out = Converter.dollarToEuro(in);
        Assert.assertEquals(expected, out);
    }
}