package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH02N031.exchangeTwoLastNumbers;

public class TaskCH02N031Test {
    public static void main(String[] args) {
        testExchangeTwoLastNumbers();
        testWrongExchangeTwoLastNumbers();
    }

    private static void testExchangeTwoLastNumbers() {
        Assert.assertEquals("TaskCH02N031Test.testExchangeTwoLastNumbers", true, exchangeTwoLastNumbers(123) == 132);
    }

    private static void testWrongExchangeTwoLastNumbers() {
        Assert.assertEquals("TaskCH02N031Test.testWrongExchangeTwoLastNumbers", false, exchangeTwoLastNumbers(123) != 132);
    }
}