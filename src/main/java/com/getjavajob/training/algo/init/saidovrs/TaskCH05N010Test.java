package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH05N010.*;

public class TaskCH05N010Test {
    public static void main(String[] args) {
        double[] dollarQuantity = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        testRubEquivalentPrice(dollarQuantity);
        testWrongrubEquivalentPrice(dollarQuantity);
    }

    private static void testRubEquivalentPrice(double[] dollarQuantity) {
        Assert.assertEquals("TaskCH05N010Test.testRubEquivalentPrice", true,
                rubEquivalentPrice(4, dollarQuantity, 50.50) == 252.5);
    }

    private static void testWrongrubEquivalentPrice(double[] dollarQuantity) {
        Assert.assertEquals("TaskCH05N010Test.testWrongRubEquivalentPrice", false,
                rubEquivalentPrice(4, dollarQuantity, 50.50) != 252.5);
    }
}