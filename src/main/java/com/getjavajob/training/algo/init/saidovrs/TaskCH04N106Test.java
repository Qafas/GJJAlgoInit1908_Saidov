package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import java.util.Objects;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH04N106.calcSeason;

public class TaskCH04N106Test {
    public static void main(String[] args) {
        testCalcSeasonWinter();
        testCalcSeasonSpring();
        testCalcSeasonSummer();
        testCalcSeasonAutumn();
    }

    private static void testCalcSeasonWinter() {
        Assert.assertEquals("TaskCH04N106Test.testCalcSeasonWinter", true, Objects.equals(calcSeason((byte) 12), "winter"));
    }

    private static void testCalcSeasonSpring() {
        Assert.assertEquals("TaskCH04N106Test.testCalcSeasonSpring", true, Objects.equals(calcSeason((byte) 3), "spring"));
    }

    private static void testCalcSeasonSummer() {
        Assert.assertEquals("TaskCH04N106Test.testCalcSeasonSummer", true, Objects.equals(calcSeason((byte) 6), "summer"));
    }

    private static void testCalcSeasonAutumn() {
        Assert.assertEquals("TaskCH04N106Test.testCalcSeasonAutumn", true, Objects.equals(calcSeason((byte) 9), "autumn"));
    }
}