package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {
    @Test
    public void when1234Then4321() {
        int[] array = new int[] {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};
        int[] result = Turn.back(array);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void when678910Then109876() {
        int[] array = new int[] {6, 7, 8, 9, 10};
        int[] expected = {10, 9, 8, 7, 6};
        int[] result = Turn.back(array);
        Assert.assertArrayEquals(expected, result);
    }
}