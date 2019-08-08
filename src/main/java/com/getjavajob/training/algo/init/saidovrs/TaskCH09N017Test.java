package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH09N017.*;

public class TaskCH09N017Test {
    public static void main(String[] args) {
        testCompareLetters();
        testWrongCompareLetters();
    }

    private static void testCompareLetters() {
        Assert.assertEquals("TaskCH09N017Test.testCompareLetters", true, compareLetters('a', 'a'));
    }

    private static void testWrongCompareLetters() {
        Assert.assertEquals("TaskCH09N017Test.testWrongCompareLetters", false, compareLetters('a', 'b'));
    }
}