/*Дан двумерный массив.
а) Удалить из него k-ю строку.
б) Удалить из него s-й столбец.*/

package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH12N234 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows in the initialArray: ");
        Scanner scanNumberOfRows = new Scanner(System.in);
        int numberOfRows = scanNumberOfRows.nextInt();
        System.out.println("Enter the number of columns in the initialArray: ");
        Scanner scanNumberOfColumns = new Scanner(System.in);
        int numberOfColumns = scanNumberOfColumns.nextInt();
        int[][] initialArray = new int[numberOfRows][numberOfColumns];
        System.out.println("Enter cell array values: ");
        for (numberOfRows = 0; numberOfRows < initialArray.length; numberOfRows++) {
            for (numberOfColumns = 0; numberOfColumns < initialArray[0].length; numberOfColumns++) {
                System.out.println("Enter value for cell " + numberOfRows + numberOfColumns + ":");
                Scanner scan = new Scanner(System.in);
                initialArray[numberOfRows][numberOfColumns] = scan.nextInt();
            }
        }
        System.out.println("The initial initialArray will be: ");
        printArray(initialArray);
        System.out.println("Enter the line number you want to delete:");
        Scanner scanLineToDelete = new Scanner(System.in);
        int lineToDelete = scanLineToDelete.nextInt();
        System.out.println("Enter the column number you want to delete: ");
        Scanner scanColumnToDelete = new Scanner(System.in);
        int columnToDelete = scanColumnToDelete.nextInt();
        System.out.println("The shortened Array will be: ");
        printArray(calcShotrenedArray(numberOfRows, numberOfColumns, initialArray, lineToDelete, columnToDelete));
    }

    static int[][] calcShotrenedArray(int numberOfRows, int numberOfColumns, int[][] initialArray, int lineToDelete, int columnToDelete) {
        int[][] shortenedArray = new int[numberOfRows - 1][numberOfColumns - 1];
        for (numberOfRows = 0; numberOfRows < initialArray.length - 1; numberOfRows++) {
            for (numberOfColumns = 0; numberOfColumns < initialArray[0].length - 1; numberOfColumns++) {

                if (numberOfRows >= lineToDelete - 1 & numberOfColumns != columnToDelete - 1) {
                    shortenedArray[numberOfRows][numberOfColumns] = initialArray[numberOfRows + 1][numberOfColumns];
                } else if (numberOfRows != lineToDelete - 1 & numberOfColumns >= columnToDelete - 1) {
                    shortenedArray[numberOfRows][numberOfColumns] = initialArray[numberOfRows][numberOfColumns + 1];
                } else if (numberOfRows >= lineToDelete - 1 & numberOfColumns >= columnToDelete - 1) {
                    shortenedArray[numberOfRows][numberOfColumns] = initialArray[numberOfRows + 1][numberOfColumns + 1];
                } else {
                    shortenedArray[numberOfRows][numberOfColumns] = initialArray[numberOfRows][numberOfColumns];
                }
            }
        }
        return shortenedArray;
    }

    private static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(String.format("%-4d", ints[j]));
            }
            System.out.println(" ");
        }
    }
}