package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static com.getjavajob.training.algo.init.saidovrs.TaskCH04N115.calcAnimalAndColourByYear;

public class TaskCH04N115Test {
    public static void main(String[] args) {
        testCalcAnimalAndColourByYear0();
        testCalcAnimalAndColourByYear1();
        testCalcAnimalAndColourByYear2();
        testCalcAnimalAndColourByYear3();
        testCalcAnimalAndColourByYear4();
        testCalcAnimalAndColourByYear5();
        testCalcAnimalAndColourByYear6();
        testCalcAnimalAndColourByYear7();
        testCalcAnimalAndColourByYear8();
        testCalcAnimalAndColourByYear9();
        testCalcAnimalAndColourByYear10();
        testCalcAnimalAndColourByYear11();
    }

    private static void testCalcAnimalAndColourByYear0() {
        Assert.assertEquals("TaskCH04N115Test.testCalculateReverseNumber", true,
                calcAnimalAndColourByYear(0).equals("Обезьяна, Белый."));
    }

    private static void testCalcAnimalAndColourByYear1() {
        Assert.assertEquals("TaskCH04N115Test.testCalculateReverseNumber", true,
                calcAnimalAndColourByYear(1).equals("Петух, Белый."));
    }

    private static void testCalcAnimalAndColourByYear2() {
        Assert.assertEquals("TaskCH04N115Test.testCalculateReverseNumber", true,
                calcAnimalAndColourByYear(2).equals("Собака, Черный."));
    }

    private static void testCalcAnimalAndColourByYear3() {
        Assert.assertEquals("TaskCH04N115Test.testCalculateReverseNumber", true,
                calcAnimalAndColourByYear(3).equals("Свинья, Черный."));
    }

    private static void testCalcAnimalAndColourByYear4() {
        Assert.assertEquals("TaskCH04N115Test.testCalculateReverseNumber", true,
                calcAnimalAndColourByYear(4).equals("Крыса, Зеленый."));
    }

    private static void testCalcAnimalAndColourByYear5() {
        Assert.assertEquals("TaskCH04N115Test.testCalculateReverseNumber", true,
                calcAnimalAndColourByYear(5).equals("Корова, Зеленый."));
    }

    private static void testCalcAnimalAndColourByYear6() {
        Assert.assertEquals("TaskCH04N115Test.testCalculateReverseNumber", true,
                calcAnimalAndColourByYear(6).equals("Тигр, Красный."));
    }

    private static void testCalcAnimalAndColourByYear7() {
        Assert.assertEquals("TaskCH04N115Test.testCalculateReverseNumber", true,
                calcAnimalAndColourByYear(7).equals("Заяц, Красный."));
    }

    private static void testCalcAnimalAndColourByYear8() {
        Assert.assertEquals("TaskCH04N115Test.testCalculateReverseNumber", true,
                calcAnimalAndColourByYear(8).equals("Дракон, Желтый."));
    }

    private static void testCalcAnimalAndColourByYear9() {
        Assert.assertEquals("TaskCH04N115Test.testCalculateReverseNumber", true,
                calcAnimalAndColourByYear(9).equals("Змея, Желтый."));
    }

    private static void testCalcAnimalAndColourByYear10() {
        Assert.assertEquals("TaskCH04N115Test.testCalculateReverseNumber", true,
                calcAnimalAndColourByYear(10).equals("Лошадь, Белый."));
    }

    private static void testCalcAnimalAndColourByYear11() {
        Assert.assertEquals("TaskCH04N115Test.testCalculateReverseNumber", true,
                calcAnimalAndColourByYear(11).equals("Овца, Белый."));
    }
}