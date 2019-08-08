package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH04N015.calcFullYears;

public class TaskCH04N015Test {
    public static void main(String[] args) {
        test1calcFullYears();
        test1WrongCalcFullYears();
        test2calcFullYears();
        test2WrongCalcFullYears();
        test3calcFullYears();
        test3WrongCalcFullYears();
    }

    private static void test1calcFullYears() {
        Assert.assertEquals("TaskCH04N015Test.test1calcFullYears", true, calcFullYears(12, 2014, 6, 1985) == 29);
    }

    private static void test1WrongCalcFullYears() {
        Assert.assertEquals("TaskCH04N015Test.test1WrongCalcFullYears", false, calcFullYears(12, 2014, 6, 1985) != 29);
    }

    private static void test2calcFullYears() {
        Assert.assertEquals("TaskCH04N015Test.test2calcFullYears", true, calcFullYears(5, 2014, 6, 1985) == 28);
    }

    private static void test2WrongCalcFullYears() {
        Assert.assertEquals("TaskCH04N015Test.test2WrongCalcFullYears", false, calcFullYears(5, 2014, 6, 1985) != 28);
    }

    private static void test3calcFullYears() {
        Assert.assertEquals("TaskCH04N015Test.test3calcFullYears", true, calcFullYears(6, 2014, 6, 1985) == 29);
    }

    private static void test3WrongCalcFullYears() {
        Assert.assertEquals("TaskCH04N015Test.test3WrongCalcFullYears", false, calcFullYears(6, 2014, 6, 1985) != 29);
    }
}