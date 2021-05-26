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

    @Test
    public void whenFind1() {
        int[] dataArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int elem = 1;
        int start = 3;
        int finish = 7;
        int actual = FindLoop.indexOf(dataArray, elem, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenFind5() {
        int[] dataArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int elem = 5;
        int start = 3;
        int finish = 7;
        int actual = FindLoop.indexOf(dataArray, elem, start, finish);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }
}