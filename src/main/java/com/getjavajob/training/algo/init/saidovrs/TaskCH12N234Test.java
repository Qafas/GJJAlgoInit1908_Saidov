package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH12N234.calcShotrenedArray;
import static java.util.Arrays.deepEquals;

public class TaskCH12N234Test {
    public static void main(String[] args) {
        int[][] initialArray = {
                {10, 10, 10},
                {20, 20, 20},
                {30, 30, 30},
        };
        int[][] shortenedArray = {
                {10, 10},
                {30, 30},
        };
        int[][] wrongShortenedArray = {
                {10, 10},
                {30, 10},
        };
        testCalcShotrenedArray(initialArray, shortenedArray);
        testWrongCalcShotrenedArray(initialArray, wrongShortenedArray);
    }

    private static void testCalcShotrenedArray(int[][] initialArray, int[][] shortenedArray) {
        Assert.assertEquals("TaskCH12N234Test.testCalcShotrenedArray", true,
                deepEquals(calcShotrenedArray(3, 3, initialArray, 2, 2), shortenedArray));
    }

    private static void testWrongCalcShotrenedArray(int[][] initialArray, int[][] wrongShortenedArray) {
        Assert.assertEquals("TaskCH12N234Test.testWrongCalcShotrenedArray", false,
                deepEquals(calcShotrenedArray(3, 3, initialArray, 2, 2), wrongShortenedArray));
    }
}