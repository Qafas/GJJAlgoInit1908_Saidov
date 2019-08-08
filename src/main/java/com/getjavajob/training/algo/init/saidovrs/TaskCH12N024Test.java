/*Заполнить массив размером 6 6 так, как показано на рис. 12.2.
1 1 1 1 1 1           1 2 3 4 5 6
1 2 3 4 5 6           2 3 4 5 6 1
1 3 6 10 15 21        3 4 5 6 1 2
1 4 10 20 35 56       4 5 6 1 2 3
1 5 15 35 70 126      5 6 1 2 3 4
1 6 21 56 126 252     6 1 2 3 4 5
а                     б
*/
package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH12N024.calcArrayA;
import static com.getjavajob.training.algo.init.saidovrs.TaskCH12N024.calcArrayB;
import static java.util.Arrays.deepEquals;

public class TaskCH12N024Test {
    public static void main(String[] args) {
        int[][] testArrayA = {
                {1, 1, 1, 1, 1, 1},
                {1, 2, 3, 4, 5, 6},
                {1, 3, 6, 10, 15, 21},
                {1, 4, 10, 20, 35, 56},
                {1, 5, 15, 35, 70, 126},
                {1, 6, 21, 56, 126, 252}
        };
        int[][] testArrayB = {
                {1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 6, 1},
                {3, 4, 5, 6, 1, 2},
                {4, 5, 6, 1, 2, 3},
                {5, 6, 1, 2, 3, 4},
                {6, 1, 2, 3, 4, 5}
        };
        testCalcArrayA(testArrayA);
        testWrongCalcArrayA(testArrayB);
        testCalcArrayB(testArrayB);
        testWrongCalcArrayB(testArrayA);
    }

    private static void testCalcArrayA(int[][] testArrayA) {
        Assert.assertEquals("TaskCH12N024Test.testCalcArrayA", true,
                deepEquals(calcArrayA(6, 6), testArrayA));
    }

    private static void testWrongCalcArrayA(int[][] testArrayB) {
        Assert.assertEquals("TaskCH12N024Test.testWrongCalcArrayA", false,
                deepEquals(calcArrayA(6, 6), testArrayB));
    }

    private static void testCalcArrayB(int[][] testArrayB) {
        Assert.assertEquals("TaskCH12N024Test.testCalcArrayB", true,
                deepEquals(calcArrayB(6, 6), testArrayB));
    }

    private static void testWrongCalcArrayB(int[][] testArrayC) {
        Assert.assertEquals("TaskCH12N024Test.testWrongCalcArrayB", false,
                deepEquals(calcArrayB(6, 6), testArrayC));
    }
}