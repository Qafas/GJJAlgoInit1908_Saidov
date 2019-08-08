/*Заполнить массив размером 6 6 так, как показано на рис. 12.2.
1 1 1 1 1 1           1 2 3 4 5 6
1 2 3 4 5 6           2 3 4 5 6 1
1 3 6 10 15 21        3 4 5 6 1 2
1 4 10 20 35 56       4 5 6 1 2 3
1 5 15 35 70 126      5 6 1 2 3 4
1 6 21 56 126 252     6 1 2 3 4 5
а                     б
1*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH12N024 {
    public static void main(String[] args) {
        System.out.println("Enter dimentions of first array(6 in the task): ");
        Scanner scanI = new Scanner(System.in);
        int i = scanI.nextInt();
        System.out.println("Enter dimentions of second array(6 in the task): ");
        Scanner scanK = new Scanner(System.in);
        int k = scanK.nextInt();
        System.out.println("First two-dimentional array will be: ");
        print(calcArrayA(i, i));
        System.out.println("Second two-dimentional array will be: ");
        print(calcArrayB(k, k));
    }

    //--------------------------------------------------
    public static int[][] calcArrayA(int i, int j) {
        int[][] arrayA = new int[i][j];
        for (i = 0; i < arrayA.length; i++) {
            for (j = 0; j < arrayA.length; j++) {
                if (i * j == 0) arrayA[i][j] = 1;
                else arrayA[i][j] = arrayA[i - 1][j] + arrayA[i][j - 1];
            }
        }
        return arrayA;
    }

    static int[][] calcArrayB(int k, int l) {
        int[][] arrayB = new int[k][l];
        for (k = 0; k < arrayB.length; k++) {
            for (l = 0; l < arrayB.length; l++) {
                arrayB[k][l] = 1 + ((k + l) % (arrayB.length));
            }
        }
        return arrayB;
    }

    private static void print(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++)
                System.out.print(ints[j] + " ");
            System.out.println();
        }
    }
}