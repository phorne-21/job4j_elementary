package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class CheckTest {
    @Test
    public void whenAllTrueThenTrue() {
        boolean[] array = new boolean[] {true, true, true};
        boolean check = Check.mono(array);
        Assert.assertTrue(check);
    }

    @Test
    public void whenSomeFalseThenFalse() {
        boolean[] array = new boolean[] {true, false, true};
        boolean check = Check.mono(array);
        Assert.assertFalse(check);
    }
}