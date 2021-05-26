package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class MinTest {
    @Test
    public void whenFirstMin() {
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7};
        int expected = 1;
        int actual = Min.findMin(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenLastMin() {
        int[] array = new int[] {7, 6, 5, 4, 2};
        int expected = 2;
        int actual = Min.findMin(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenMiddleMin() {
        int[] array = new int[] {7, 6, 2, 4, 28};
        int expected = 2;
        int actual = Min.findMin(array);
        Assert.assertEquals(expected, actual);
    }

}