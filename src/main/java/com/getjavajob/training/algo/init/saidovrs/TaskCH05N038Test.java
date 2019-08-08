package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH05N038.distanceFromHome;
import static com.getjavajob.training.algo.init.saidovrs.TaskCH05N038.totalDistance;

public class TaskCH05N038Test {
    public static void main(String[] args) {
        testDistanceFromHome();
        testTotalDistance();
        testWrongDistanceFromHome();
        testWrongTotalDistance();
    }

    private static void testDistanceFromHome() {
        Assert.assertEquals("TaskCH05N038Test.testDistanceFromHome", true,
                distanceFromHome(1000, 5) == 783.3333333333333);
    }

    private static void testTotalDistance() {
        Assert.assertEquals("TaskCH05N038Test.testTotalDistance", true,
                totalDistance(1000, 5) == 2283.333333333333);
    }

    private static void testWrongDistanceFromHome() {
        Assert.assertEquals("TaskCH05N038Test.testWrongDistanceFromHome", false,
                distanceFromHome(1000, 5) != 783.3333333333333);
    }

    private static void testWrongTotalDistance() {
        Assert.assertEquals("TaskCH05N038Test.testWrongTotalDistance", false,
                totalDistance(1000, 5) != 2283.333333333333);
    }
}