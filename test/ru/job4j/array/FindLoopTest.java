package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class FindLoopTest {
    @Test
    public void whenArrayHas36Then3() {
        int[] dataArray = new int[] {5, 7, 18, 36};
        int expected = 3;
        int elem = 36;
        int actual = FindLoop.indexOf(dataArray, elem);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenArrayHas1Then1() {
        int[] dataArray = new int[] {5, 7, 18, 36};
        int expected = -1;
        int elem = 1;
        int actual = FindLoop.indexOf(dataArray, elem);
        Assert.assertEquals(expected, actual);
    }
}