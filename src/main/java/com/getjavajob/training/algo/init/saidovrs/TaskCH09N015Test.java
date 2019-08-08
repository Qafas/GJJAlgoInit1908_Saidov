package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH09N015.*;

public class TaskCH09N015Test {
    public static void main(String[] args) {
        testCalcCharPositionFromK();
        testCalcWrongCharPositionFromK();
    }

    private static void testCalcCharPositionFromK() {
        Assert.assertEquals("TaskCH09N015Test.testCalcCharPositionFromK", true, calcCharPositionFromK(3, "alfabet") == 'f');
    }

    private static void testCalcWrongCharPositionFromK() {
        Assert.assertEquals("TaskCH09N015Test.testCalcWrongCharPositionFromK", false, calcCharPositionFromK(3, "alfabet") != 'f');
    }
}