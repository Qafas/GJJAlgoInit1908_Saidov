/*3.29. Записать условие, которое является истинным, когда:
 *а) каждое из чисел X и Y нечетное;
 *б) только одно из чисел X и Y меньше 20;
 *в) хотя бы одно из чисел X и Y равно нулю;
 *г) каждое из чисел X, Y, Z отрицательное;
 *д) только одно из чисел X, Y и Z кратно пяти;
 *е) хотя бы одно из чисел X, Y, Z больше 100.
 */

package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH03N029.*;

public class TaskCH03N029Test {
    public static void main(String[] args) {
        testTaskAXYOdd();
        testWrongTaskAXEven();
        testWrongTaskAYEven();
        testWrongTaskAXYEven();
        testTaskBXLessThan20();
        testTaskBYLessThan20();
        testWrongTaskBXYLessThan20();
        testWrongTaskBXYMoreThan20();
        testTaskVXEqualTOZero();
        testTaskVYEqualTOZero();
        testTaskVXYEqualTOZero();
        testWrongTaskVXYUnequalToZero();
        testTaskGXYZNegative();
        testWrongTaskGXPositive();
        testWrongTaskGYPositive();
        testWrongTaskGZPositive();
        testWrongTaskGXYPositive();
        testWrongTaskGXZPositive();
        testWrongTaskGYZPositive();
        testWrongTaskGXYZPositive();
        testTaskDXmultiple5();
        testTaskDYmultiple5();
        testTaskDZmultiple5();
        testWrongTaskD0multiple5();
        testWrongTaskDXYmultiple5();
        testWrongTaskDXZmultiple5();
        testWrongTaskDYZmultiple5();
        testWrongTaskDXYZmultiple5();
        testTaskEXMoreThan100();
        testTaskEYMoreThan100();
        testTaskEZMoreThan100();
        testTaskEXYMoreThan100();
        testTaskEXZMoreThan100();
        testTaskEYZMoreThan100();
        testTaskEXYZMoreThan100();
        testWrongTaskEXYZLessThan100();
    }

    private static void testTaskAXYOdd() {
        Assert.assertEquals("TaskCH03N029Test.testTaskAXYOdd", true, taskA(1, 3));
    }

    private static void testWrongTaskAXEven() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskAXEven", false, taskA(4, 3));
    }

    private static void testWrongTaskAYEven() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskAYEven", false, taskA(1, 2));
    }

    private static void testWrongTaskAXYEven() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskAXYEven", false, taskA(4, 2));
    }

    private static void testTaskBXLessThan20() {
        Assert.assertEquals("TaskCH03N029Test.testTaskBXLessThan20", true, taskB(10, 22));
    }

    private static void testTaskBYLessThan20() {
        Assert.assertEquals("TaskCH03N029Test.testTaskBYLessThan20", true, taskB(22, 10));
    }

    private static void testWrongTaskBXYLessThan20() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskBXYLessThan20", false, taskB(1, 2));
    }

    private static void testWrongTaskBXYMoreThan20() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskBXYMoreThan20", false, taskB(22, 21));
    }

    private static void testTaskVXEqualTOZero() {
        Assert.assertEquals("TaskCH03N029Test.testTaskVXEqualTOZero", true, taskV(0, 1));
    }

    private static void testTaskVYEqualTOZero() {
        Assert.assertEquals("TaskCH03N029Test.testTaskVYEqualTOZero", true, taskV(1, 0));
    }

    private static void testTaskVXYEqualTOZero() {
        Assert.assertEquals("TaskCH03N029Test.testTaskVXYEqualTOZero", true, taskV(0, 0));
    }

    private static void testWrongTaskVXYUnequalToZero() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskVXYUnequalToZero", false, taskV(1, 2));
    }

    private static void testTaskGXYZNegative() {
        Assert.assertEquals("TaskCH03N029Test.testTaskGXYZNegative", true, taskG(-1, -2, -3));
    }

    private static void testWrongTaskGXPositive() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskGXPositive", false, taskG(1, -2, -3));
    }

    private static void testWrongTaskGYPositive() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskGYPositive", false, taskG(-1, 2, -3));
    }

    private static void testWrongTaskGZPositive() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskGZPositive", false, taskG(-1, -2, 3));
    }

    private static void testWrongTaskGXYPositive() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskGXYPositive", false, taskG(1, 2, -3));
    }

    private static void testWrongTaskGXZPositive() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskGXZPositive", false, taskG(1, -2, 3));
    }

    private static void testWrongTaskGYZPositive() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskGYZPositive", false, taskG(1, -2, -3));
    }

    private static void testWrongTaskGXYZPositive() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskGXYZPositive", false, taskG(1, 2, 3));
    }

    private static void testTaskDXmultiple5() {
        Assert.assertEquals("TaskCH03N029Test.testTaskDXmultiple5", true, taskD(5, 3, 1));
    }

    private static void testTaskDYmultiple5() {
        Assert.assertEquals("TaskCH03N029Test.testTaskDYmultiple5", true, taskD(1, 10, 2));
    }

    private static void testTaskDZmultiple5() {
        Assert.assertEquals("TaskCH03N029Test.testTaskDZmultiple5", true, taskD(1, 3, 15));
    }

    private static void testWrongTaskD0multiple5() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskD0multiple5", false, taskD(1, 2, 3));
    }

    private static void testWrongTaskDXYmultiple5() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskDXYmultiple5", false, taskD(5, 55, 3));
    }

    private static void testWrongTaskDXZmultiple5() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskDXZmultiple5", false, taskD(5, 2, 55));
    }

    private static void testWrongTaskDYZmultiple5() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskDYZmultiple5", false, taskD(1, 5, 55));
    }

    private static void testWrongTaskDXYZmultiple5() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskDXYZmultiple5", false, taskD(5, 55, 555));
    }

    private static void testTaskEXMoreThan100() {
        Assert.assertEquals("TaskCH03N029Test.testTaskEXMoreThan100", true, taskE(111, 2, 3));
    }

    private static void testTaskEYMoreThan100() {
        Assert.assertEquals("TaskCH03N029Test.testTaskEYMoreThan100", true, taskE(1, 111, 3));
    }

    private static void testTaskEZMoreThan100() {
        Assert.assertEquals("TaskCH03N029Test.testTaskEZMoreThan100", true, taskE(1, 2, 111));
    }

    private static void testTaskEXYMoreThan100() {
        Assert.assertEquals("TaskCH03N029Test.testTaskEXYMoreThan100", true, taskE(111, 111, 3));
    }

    private static void testTaskEXZMoreThan100() {
        Assert.assertEquals("TaskCH03N029Test.testTaskEXZMoreThan100", true, taskE(111, 2, 111));
    }

    private static void testTaskEYZMoreThan100() {
        Assert.assertEquals("TaskCH03N029Test.testTaskEYZMoreThan100", true, taskE(1, 111, 111));
    }

    private static void testTaskEXYZMoreThan100() {
        Assert.assertEquals("TaskCH03N029Test.testTaskEXYZMoreThan100", true, taskE(111, 111, 111));
    }

    private static void testWrongTaskEXYZLessThan100() {
        Assert.assertEquals("TaskCH03N029Test.testWrongTaskEXYZLessThan100", false, taskE(1, 2, 3));
    }
}