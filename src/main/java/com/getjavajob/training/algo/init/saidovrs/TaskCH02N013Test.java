package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH02N013.*;

public class TaskCH02N013Test {
    public static void main(String[] args) {
        testCalculateRevertNumber();
        testCalculateRevertNumberWithZero();
        testWrongCalculateRevertNumber();
    }

    private static void testCalculateRevertNumber() {
        Assert.assertEquals("TaskCH02N013Test.testCalculateRevertNumber", true, calculateRevertNumber(123) == 321);
    }

    private static void testCalculateRevertNumberWithZero() {
        Assert.assertEquals("TaskCH02N013Test.testCalculateRevertNumberWithZero", true, calculateRevertNumber(150) == 51);
    }

    private static void testWrongCalculateRevertNumber() {
        Assert.assertEquals("TaskCH02N013Test.testWrongCalculateRevertNumber", false, calculateRevertNumber(123) == 555);
    }
}