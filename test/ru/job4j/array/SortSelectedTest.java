package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortAgain() {
        int[] data = new int[] {4, 6, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {3, 4, 6};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortAgainMore() {
        int[] data = new int[] {43, 16, 333, 10, 12};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {10, 12, 16, 43, 333};
        Assert.assertArrayEquals(expected, result);
    }
}