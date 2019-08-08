package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH12N028.calculationSelfClosingArray;
import static java.util.Arrays.deepEquals;

public class TaskCH12N028Test {
    public static void main(String[] args) {
        int[][] testArray = {
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}
        };
        int[][] testWrongArray = {
                {1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 0, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}
        };
        testCalculationSelfClosingArray(testArray);
        testWrongCalculationSelfClosingArray(testWrongArray);
    }

    private static void testCalculationSelfClosingArray(int[][] testArray) {
        Assert.assertEquals("TaskCH12N028Test.testCalculationSelfClosingArray", true,
                deepEquals(calculationSelfClosingArray(5, 5, 2), testArray));
    }

    private static void testWrongCalculationSelfClosingArray(int[][] testWrongArray) {
        Assert.assertEquals("TaskCH12N028Test.testWrongCalculationSelfClosingArray", false,
                deepEquals(calculationSelfClosingArray(5, 5, 2), testWrongArray));
    }
}