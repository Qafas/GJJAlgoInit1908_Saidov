package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH05N064.*;

public class TaskCH05N064Test {
    public static void main(String[] args) {
        double[] distSquare = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200};
        double[] distPopulation = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000, 11000, 12000};
        testCalcDensity(distSquare, distPopulation);
        testWrongCalcDencity(distSquare, distPopulation);
    }

    private static void testCalcDensity(double[] distSquare, double[] distPopulation) {
        Assert.assertEquals("TaskCH05N064Test.testCalcDensity", true,
                calcDensity(distSquare, distPopulation) == 10);
    }

    private static void testWrongCalcDencity(double[] distSquare, double[] distPopulation) {
        Assert.assertEquals("TaskCH05N064Test.testWrongCalcDensity", false,
                calcDensity(distSquare, distPopulation) != 10);
    }
}