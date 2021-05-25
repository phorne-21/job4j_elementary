package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqLastTest {
    @Test
    public void whenTrue() {
        int[] left = new int[] {1, 2, 3, 6, 34, 66};
        int[] right = new int[] {2, 4, 66};
        boolean result = EqLast.check(left, right);
        Assert.assertTrue(result);
    }

    @Test
    public void whenFalse() {
        int[] left = new int[] {1, 2, 3, 6, 34, 66};
        int[] right = new int[] {2, 4, 65};
        boolean result = EqLast.check(left, right);
        Assert.assertFalse(result);
    }
}
