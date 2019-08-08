package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import java.util.Arrays;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH06N008.comparisonN;

public class TaskCH06N008Test {
    public static void main(String[] args) {
        int[] testArray = {0, 1, 4, 9};
        int[] testWrongArray = {0, 1, 4, 8};
        testComparisonN(testArray);
        testWrongComparisonN(testWrongArray);
    }

    private static void testComparisonN(int[] testArray) {
        Assert.assertEquals("TaskCH06N008Test.testComparisonN", true,
                Arrays.equals(comparisonN(10), testArray));
    }

    private static void testWrongComparisonN(int[] testWrongArray) {
        Assert.assertEquals("TaskCH06N008Test.testWrongComparisonN", false,
                Arrays.equals(comparisonN(10), testWrongArray));
    }
}