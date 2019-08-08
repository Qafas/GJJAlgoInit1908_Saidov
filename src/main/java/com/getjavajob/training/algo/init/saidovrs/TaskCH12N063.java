/*В двумерном массиве хранится информация о количестве учеников в том или ином классе каждой параллели
 *школы с первой по одиннадцатую (в пер-вой строке — информация о количестве учеников в первых классах,
 *во вто-рой — о вторых и т. д.). В каждой параллели имеются 4 класса. Определить среднее количество
 *учеников в классах каждой параллели.
 */

package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH12N063 {
    public static void main(String[] args) {
        System.out.println("Enter the value of the number of parallelss in the school (11 according to the task): ");
        Scanner scanParallels= new Scanner(System.in);
        int parallels = scanParallels.nextInt();
        System.out.println("Enter the value of the number of classes in parallels (4 according to the task): ");
        Scanner scanClasses = new Scanner(System.in);
        int classes = scanClasses.nextInt();
        int[][] array = enterNumberOfStudents(parallels, classes);
        System.out.println("The table with the number of students looks like: ");
        print2DArray(array);
        System.out.println("Average number of students in grades 1 through 11: ");
        printArray(calcAverageNumberOfStudents(parallels, array));
    }

    static int[][] enterNumberOfStudents(int parallels, int classes) {
        int[][] array = new int[parallels][classes];
        for (parallels = 0; parallels < array.length; parallels++) {
            for (classes = 0; classes < array[0].length; classes++) {
                System.out.print("Enter the number of students in " + (parallels + 1) + " classes:");
                Scanner scan = new Scanner(System.in);
                array[parallels][classes] = scan.nextInt();
            }
            System.out.println(" ");
        }
        return array;
    }

    static int[] calcAverageNumberOfStudents(int parallels, int[][] array) {
        int[] sumArray = new int[parallels];
        for (parallels = 0; parallels < array.length; parallels++) {
            for (int j = 0; j < array[0].length; j++) {
                sumArray[parallels] = sumArray[parallels] + array[parallels][j];
            }
            sumArray[parallels] = sumArray[parallels] / array[0].length;
        }
        return sumArray;
    }

    private static void print2DArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(String.format("%-4d", ints[j]));
            }
            System.out.println();
        }
    }

    private static void printArray(int[] sumArray) {
        for (int value : sumArray) {
            System.out.println(String.format("%-4d", value));
        }
    }
}