package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import java.util.Arrays;

public class TaskCH11N158Test {
    public static void main(String[] args) {
        int[] initialArray = {1, 2, 3, 4, 5, 4, 3, 2, 1, 6, 7, 6, 7};
        int[] cleanedArray = {1, 2, 3, 4, 5, 6, 7};
        testArrayCleaning(initialArray, cleanedArray);
        testWrongArrayCleaning(initialArray);
    }

    private static void testArrayCleaning(int[] initialArray, int[] cleanedArray) {
        Assert.assertEquals("TaskCH11N158Test.testArrayCleaning", true,
                Arrays.equals(TaskCH11N158.arrayCleaning(initialArray), cleanedArray));
    }

    private static void testWrongArrayCleaning(int[] initialArray) {
        Assert.assertEquals("TaskCH11N158Test.testWrongArrayCleaning", false,
                Arrays.equals(TaskCH11N158.arrayCleaning(initialArray), initialArray));
    }
}