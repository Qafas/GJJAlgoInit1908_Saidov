package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH02N043.*;

public class TaskCH02N043Test {
    public static void main(String[] args) {
        testADivBEqualZero();
        testBDivAEqualZero();
        testAEqualZero();
        testBEqualZero();
        testWrongADivBEqualZero();
        testWrongBDivAEqualZero();
    }

    private static void testADivBEqualZero() {
        Assert.assertEquals("TaskCH02N043Test.testCalcAnswerADivBEqualZero", true, dividingOfNumbersWithoutRemainder(10, 2) == 1);
    }

    private static void testBDivAEqualZero() {
        Assert.assertEquals("TaskCH02N043Test.testCalcAnswerBDivAEqualZero", true, dividingOfNumbersWithoutRemainder(2, 10) == 1);
    }

    private static void testAEqualZero() {
        Assert.assertEquals("TaskCH02N043Test.testCalcAnswerAEqualZero", false, dividingOfNumbersWithoutRemainder(0, 5) == 1);
    }

    private static void testBEqualZero() {
        Assert.assertEquals("TaskCH02N043Test.testCalcAnswerBEqualZero", false,dividingOfNumbersWithoutRemainder(5, 0) == 1);
    }

    private static void testWrongADivBEqualZero() {
        Assert.assertEquals("TaskCH02N043Test.testCalcWrongAnswerADivBEqualZero", true, dividingOfNumbersWithoutRemainder(5, 3) != 1);
    }

    private static void testWrongBDivAEqualZero() {
        Assert.assertEquals("TaskCH02N043Test.testCalcWrongAnswerBDivAEqualZero", true, dividingOfNumbersWithoutRemainder(3, 5) != 1);
    }
}