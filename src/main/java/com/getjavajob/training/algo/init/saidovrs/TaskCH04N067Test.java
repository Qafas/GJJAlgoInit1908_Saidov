package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import java.util.Objects;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH04N067.dayStatus;

public class TaskCH04N067Test {
    public static void main(String[] args) {
        testDayStatusWorkingDay();
        testDayStatusHoliday();
    }

    private static void testDayStatusWorkingDay() {
        Assert.assertEquals("TaskCH04N067Test.testDayStatusWorkingDay", true, Objects.equals(dayStatus(71), "Working day."));
    }

    private static void testDayStatusHoliday() {
        Assert.assertEquals("TaskCH04N067Test.testDayStatusHoliday", true, Objects.equals(dayStatus(70), "Holiday."));
    }
}