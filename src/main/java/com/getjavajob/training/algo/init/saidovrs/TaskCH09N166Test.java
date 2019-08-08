package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH09N166.*;

public class TaskCH09N166Test {
    public static void main(String[] args) {
        testExchangeFirstLastWord();
        testWrongExchangeFirstLastWord();
    }

    private static void testExchangeFirstLastWord() {
        Assert.assertEquals("TaskCH09N166Test.testExchangeFirstLastWord", true,
                exchangeFirstLastWord("I want to break free").equals("free want to break I"));
    }

    private static void testWrongExchangeFirstLastWord() {
        Assert.assertEquals("TaskCH09N166Test.testWrongExchangeFirstLastWord", false,
                exchangeFirstLastWord("I want to break free").equals("I want to break free"));
    }
}