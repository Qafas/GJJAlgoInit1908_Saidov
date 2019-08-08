package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH09N042.*;

public class TaskCH09N042Test {
    public static void main(String[] args) {
        testReverseWord();
        testWrongReverseWord();
    }

    private static void testReverseWord() {
        Assert.assertEquals("TaskCH09N042Test.testReverseWord", true, reverseWord("qwerty").equals("ytrewq"));
    }

    private static void testWrongReverseWord() {
        Assert.assertEquals("TaskCH09N042Test.testWrongReverseWord", false, reverseWord("qwerty").equals("qwerty"));
    }
}