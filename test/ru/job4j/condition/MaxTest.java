package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax7To2Then7() {
        int left = 1;
        int right = 2;
        int seven = 7;
        int result = Max.max(left, right, seven);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2Then2() {
        int left = 2;
        int right = 2;
        int two = 2;
        int result = Max.max(left, right, two);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3And34To2Then3() {
        int left = 3;
        int right = 2;
        int one = 1;
        int result = Max.max(left, right, one);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }


    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax2To2Then2() {
        int left = 2;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To5Then5() {
        int left = 1;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

}