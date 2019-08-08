package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH04N033.Even;

public class TaskCH04N033Test {
    public static void main(String[] args) {
        testEven();
        testOdd();
    }

    private static void testEven() {
        Assert.assertEquals("TaskCH04N033Test.testEven", true, Even(22));
    }

    private static void testOdd() {
        Assert.assertEquals("TaskCH04N033Test.testOdd", false, Even(123));
    }
}