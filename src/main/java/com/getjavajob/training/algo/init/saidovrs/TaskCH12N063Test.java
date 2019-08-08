package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import java.util.Arrays;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH12N063.calcAverageNumberOfStudents;
import static com.getjavajob.training.algo.init.saidovrs.TaskCH12N063.enterNumberOfStudents;
import static java.util.Arrays.deepEquals;

public class TaskCH12N063Test {
    public static void main(String[] args) {
        int[][] testArray = {
                {10, 10},
                {20, 20},
                {30, 30},
        };
        int[][] testWrongArray = {
                {10, 10},
                {20, 20},
                {30, 0},
        };
        int[] testAverageArray = {10, 20, 30};
        int[] testWrongAverageArray = {10, 20, 0};
        testEnterNumberOfStudents(testArray);
        testWrongEnterNumberOfStudents(testWrongArray);
        testCalcAverageNumberOfStudents(testArray, testAverageArray);
        testWrongCalcAverageNumberOfStudents(testArray, testWrongAverageArray);
    }

    private static void testEnterNumberOfStudents(int[][] testArray) {
        Assert.assertEquals("TaskCH12N063Test.testEnterNumberOfStudents", true,
                deepEquals(enterNumberOfStudents(3, 2), testArray));
    }

    private static void testWrongEnterNumberOfStudents(int[][] testWrongArray) {
        Assert.assertEquals("TaskCH12N063Test.testWrongEnterNumberOfStudents", false,
                deepEquals(enterNumberOfStudents(3, 2), testWrongArray));
    }

    private static void testCalcAverageNumberOfStudents(int[][] testArray, int[] testAverageArray) {
        Assert.assertEquals("TaskCH12N063Test.testCalcAverageNumberOfStudents", true,
                Arrays.equals(calcAverageNumberOfStudents(3, testArray), testAverageArray));
    }

    private static void testWrongCalcAverageNumberOfStudents(int[][] testArray, int[] testWrongAverageArray) {
        Assert.assertEquals("TaskCH12N063Test.testWrongCalcAverageNumberOfStudents", false,
                Arrays.equals(calcAverageNumberOfStudents(3, testArray), testWrongAverageArray));
    }
}