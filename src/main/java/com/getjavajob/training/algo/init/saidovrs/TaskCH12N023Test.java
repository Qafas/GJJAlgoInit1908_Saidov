/*Заполнить двумерный массив размером 7 7 так, как показано на рис. 12.1.
1 0 0 0 0 0 1                 1 0 0 1 0 0 1                   1 1 1 1 1 1 1           
0 1 0 0 0 1 0                 0 1 0 1 0 1 0                   0 1 1 1 1 1 0
0 0 1 0 1 0 0                 0 0 1 1 1 0 0                   0 0 1 1 1 0 0
0 0 0 1 0 0 0                 1 1 1 1 1 1 1                   0 0 0 1 0 0 0
0 0 1 0 1 0 0                 0 0 1 1 1 0 0                   0 0 1 1 1 0 0
0 1 0 0 0 1 0                 0 1 0 1 0 1 0                   0 1 1 1 1 1 0
1 0 0 0 0 0 1                 1 0 0 1 0 0 1                   1 1 1 1 1 1 1
а                             б                               в
*/
package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH12N023.*;
import static java.util.Arrays.deepEquals;

public class TaskCH12N023Test {
    public static void main(String[] args) {
        int[][] testArrayA = {
                {1, 0, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 1, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 1}
        };
        int[][] testArrayB = {
                {1, 0, 0, 1, 0, 0, 1},
                {0, 1, 0, 1, 0, 1, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {1, 1, 1, 1, 1, 1, 1},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 0, 1, 0, 1, 0},
                {1, 0, 0, 1, 0, 0, 1}
        };
        int[][] testArrayC = {
                {1, 1, 1, 1, 1, 1, 1},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1}
        };
        testCalcArrayA(testArrayA);
        testWrongCalcArrayA(testArrayB);
        testCalcArrayB(testArrayB);
        testWrongCalcArrayB(testArrayC);
        testCalcArrayV(testArrayC);
        testWrongCalcArrayV(testArrayA);
    }

    private static void testCalcArrayA(int[][] testArrayA) {
        Assert.assertEquals("TaskCH12N023Test.testCalcArrayA", true,
                deepEquals(calcArrayA(7, 7), testArrayA));
    }

    private static void testWrongCalcArrayA(int[][] testArrayB) {
        Assert.assertEquals("TaskCH12N023Test.testWrongCalcArrayA", false,
                deepEquals(calcArrayA(7, 7), testArrayB));
    }

    private static void testCalcArrayB(int[][] testArrayB) {
        Assert.assertEquals("TaskCH12N023Test.testCalcArrayB", true,
                deepEquals(calcArrayB(7, 7), testArrayB));
    }

    private static void testWrongCalcArrayB(int[][] testArrayC) {
        Assert.assertEquals("TaskCH12N023Test.testWrongCalcArrayB", false,
                deepEquals(calcArrayB(7, 7), testArrayC));
    }

    private static void testCalcArrayV(int[][] testArrayC) {
        Assert.assertEquals("TaskCH12N023Test.testCalcArrayV", true,
                deepEquals(calcArrayV(7, 7), testArrayC));
    }

    private static void testWrongCalcArrayV(int[][] testArrayA) {
        Assert.assertEquals("TaskCH12N023Test.testWrongCalcArrayV", false,
                deepEquals(calcArrayV(7, 7), testArrayA));
    }
}