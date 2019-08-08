package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH09N022.*;

public class TaskCH09N022Test {
    public static void main(String[] args) {
        testHalfWord();
        testWrongHalfWord();
    }

    private static void testHalfWord() {
        Assert.assertEquals("TaskCH09N022Test.testHalfWord", true, halfWord("corner").equals("cor"));
    }

    private static void testWrongHalfWord() {
        Assert.assertEquals("TaskCH09N022Test.testWrongHalfWord", false, halfWord("corner").equals("aaa"));
    }
}