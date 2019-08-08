package com.getjavajob.training.algo.init.saidovrs;

import com.getjavajob.training.algo.util.Assert;

import static java.util.Arrays.deepEquals;

public class TaskCH13N12Test {
    public static void main(String[] args) {
        final String[] testEmployees1 = new String[]{
                "Павлов Павел Павлович. Устроился на работу 7:1999.",
                "Александров Александр Александрович. Устроился на работу 11:1995.",
                "Игорев Игорь Игоревич. Устроился на работу 9:1989."
        };
        final String[] wrongTestEmployees1 = new String[]{
                "Павлов Павел Павлович. Устроился на работу 7:1999.",
                "Александров Александр Александрович. Устроился на работу 11:1995.",
        };
        final String[] testEmployees2 = new String[]{
                "Петров Петр Петрович. Проживает по адресу: ул. Петровская д.2.",
                "Никитин Петр Никитич. Проживает по адресу: ул. Никитская д.5."
        };
        final String[] wrongTestEmployees2 = new String[]{
                "Петров Петр Петрович. Проживает по адресу: ул. Петровская д.2."
        };
        final String[] testEmployees3 = new String[]{
                "Павлович Павел поступил на работу  7.1999. На 10.2000 проработал в компании 1 год.",
                "Александрович Александр поступил на работу  11.1995. На 10.2000 проработал в компании 4 год.",
                "Игоревич Игорь поступил на работу  9.1989. На 10.2000 проработал в компании 11 год.",
        };
        final String[] wrongTestEmployees3 = new String[]{
                "Павлович Павел поступил на работу  7.1999. На 10.2000 проработал в компании 1 год.",
                "Александрович Александр поступил на работу  11.1995. На 10.2000 проработал в компании 4 год."
        };
        Database database1 = new Database(10, 2010, 10);
        Database database2 = new Database("пет");
        Database database3 = new Database(10, 2000);
        String[] emp1 = database1.searchByWorkExperience();
        String[] emp2 = database2.searchByWorkExperience();
        String[] emp3 = database3.outputExperienceYears();
        testSearchByWorkExperience(emp1, testEmployees1);
        testWrongSearchByWorkExperience(emp1, wrongTestEmployees1);
        testSearchByName(emp2, testEmployees2);
        testWrongSearchByName(emp2, wrongTestEmployees2);
        testOutputExperienceYears(emp3, testEmployees3);
        testWrongOutputExperienceYears(emp3, wrongTestEmployees3);
    }

    //--------------------------------
    private static void testSearchByWorkExperience(String[] emp1, String[] testEmployees1) {
        Assert.assertEquals("TaskCH13N12Test.testSearchByWorkExperience", true, deepEquals(emp1, testEmployees1));
    }

    private static void testWrongSearchByWorkExperience(String[] emp1, String[] wrongTestEmployees1) {
        Assert.assertEquals("TaskCH13N12Test.testSearchByWorkExperience", false, deepEquals(emp1, wrongTestEmployees1));
    }

    private static void testSearchByName(String[] emp2, String[] testEmployees2) {
        Assert.assertEquals("TaskCH13N12Test.testSearchByName", true, deepEquals(emp2, testEmployees2));
    }

    private static void testWrongSearchByName(String[] emp2, String[] wrongTestEmployees2) {
        Assert.assertEquals("TaskCH13N12Test.testSearchByName", false, deepEquals(emp2, wrongTestEmployees2));
    }

    private static void testOutputExperienceYears(String[] emp3, String[] testEmployees3) {
        Assert.assertEquals("TaskCH13N12Test.testSearchByWorkExperience", true, deepEquals(emp3, testEmployees3));
    }

    private static void testWrongOutputExperienceYears(String[] emp3, String[] wrongTestEmployees3) {
        Assert.assertEquals("TaskCH13N12Test.testSearchByWorkExperience", false, deepEquals(emp3, wrongTestEmployees3));
    }
}