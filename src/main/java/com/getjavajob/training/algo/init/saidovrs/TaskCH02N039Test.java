package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH02N039.calculateRotationAngle;

public class TaskCH02N039Test {
    public static void main(String[] args) {
        testCalculateRotationAngle();
        testWrongCalculateRotationAngle();
    }

    private static void testCalculateRotationAngle() {
        Assert.assertEquals("TaskCH02N039Test.testСalculateRotationAngle", true,
                calculateRotationAngle(6, 30, 30) == 195.25);
    }

    private static void testWrongCalculateRotationAngle() {
        Assert.assertEquals("TaskCH02N039Test.testWrongСalculateRotationAngle", false,
                calculateRotationAngle(6, 30, 30) != 195.25);
    }
}