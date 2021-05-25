package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayCharTest {
    @Test
    public void whenDiffThenFalse() {
        char[] hello = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'H', 'e', 'e'};
        boolean tryArray = ArrayChar.startWith(hello, pref);
        Assert.assertFalse(tryArray);
    }

    @Test
    public void whenDiffThenTrue() {
        char[] hello = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'H', 'e', 'l'};
        boolean tryArray = ArrayChar.startWith(hello, pref);
        Assert.assertTrue(tryArray);
    }
}