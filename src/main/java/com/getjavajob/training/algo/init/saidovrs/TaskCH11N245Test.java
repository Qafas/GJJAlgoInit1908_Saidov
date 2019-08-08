package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import java.util.Arrays;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH11N245.arraySorting;

public class TaskCH11N245Test {
    public static void main(String[] args) {
        int[] initialArray = {1, -1, 3, -3, 5, -5, 7, -7, 9};
        int[] sortedArray = {-7, -5, -3, -1, 1, 3, 5, 7, 9};
        int[] wrongArray = {-7, 4, -3, 4, 1, 4, 5, 4, 9};
        testArraySorting(initialArray, sortedArray);
        testWrongArraySorting(initialArray, wrongArray);
    }

    private static void testArraySorting(int[] initialArray, int[] sortedArray) {
        Assert.assertEquals("TaskCH11N245Test.testArraySorting", true,
                Arrays.equals(arraySorting(initialArray), sortedArray));
    }

    private static void testWrongArraySorting(int[] initialArray, int[] wrongArray) {
        Assert.assertEquals("TaskCH11N245Test.testWrongArraySorting", false,
                Arrays.equals(arraySorting(initialArray), wrongArray));
    }
}