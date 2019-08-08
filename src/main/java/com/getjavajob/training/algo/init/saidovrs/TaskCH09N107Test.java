package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH09N107.exchangeChar;

public class TaskCH09N107Test {
    public static void main(String[] args) {
        testExchangeChar();
        testWrongExchangeChar();
    }

    private static void testExchangeChar() {
        Assert.assertEquals("TaskCH09N107Test.testCalculateReverseNumber", true,
                exchangeChar("yamamoto").equals("yomamota"));
    }

    private static void testWrongExchangeChar() {
        Assert.assertEquals("TaskCH09N107Test.testCalculateReverseNumberZero", false,
                exchangeChar("yamamoto").equals("yomomata"));
    }
}