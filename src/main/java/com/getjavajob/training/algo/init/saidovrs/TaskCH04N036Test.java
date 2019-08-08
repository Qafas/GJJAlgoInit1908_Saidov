package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH04N036.*;

public class TaskCH04N036Test {
    public static void main(String[] args) {
        testCalculateColourRed();
        testWrongCalculateColourGreen();
    }

    private static void testCalculateColourRed() {
        Assert.assertEquals("TaskCH04N036Test.testCalcColourRed", false, calculateColour(3));
    }

    private static void testWrongCalculateColourGreen() {
        Assert.assertEquals("TaskCH04N036Test.testCalcColourGreen", true, calculateColour(5));
    }
}