/*Заполнить двумерный массив размером 7 7 так, как показано на рис. 12.1.
1 0 0 0 0 0 1                 1 0 0 1 0 0 1                   1 1 1 1 1 1 1           
0 1 0 0 0 1 0                 0 1 0 1 0 1 0                   0 1 1 1 1 1 0
0 0 1 0 1 0 0                 0 0 1 1 1 0 0                   0 0 1 1 1 0 0
0 0 0 1 0 0 0                 1 1 1 1 1 1 1                   0 0 0 1 0 0 0
0 0 1 0 1 0 0                 0 0 1 1 1 0 0                   0 0 1 1 1 0 0
0 1 0 0 0 1 0                 0 1 0 1 0 1 0                   0 1 1 1 1 1 0
1 0 0 0 0 0 1                 1 0 0 1 0 0 1                   1 1 1 1 1 1 1
а                             б                               в
1*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH12N023 {
    public static void main(String[] args) {
        int i;
        do {
            System.out.println("Enter odd dimentions of first array: ");
            Scanner scanx = new Scanner(System.in);
            i = scanx.nextInt();
        } while (i % 2 == 0);
        int k;
        do {
            System.out.println("Enter odd dimentions of second array: ");
            Scanner scank = new Scanner(System.in);
            k = scank.nextInt();
        } while (k % 2 == 0);
        int m;
        do {
            System.out.println("Enter odd dimentions of third array: ");
            Scanner scanm = new Scanner(System.in);
            m = scanm.nextInt();
        } while (m % 2 == 0);
        System.out.println("First two-dimentional array will be: ");
        print(calcArrayA(i, i));
        System.out.println("Second two-dimentional array will be: ");
        print(calcArrayB(k, k));
        System.out.println("Third two-dimentional array will be: ");
        print(calcArrayV(m, m));
    }

    static int[][] calcArrayA(int i, int j) {
        int[][] arrayA = new int[i][j];
        for (i = 0; i < arrayA.length; i++) {
            for (j = 0; j < arrayA.length; j++) {
                if (i == j | i == (arrayA.length - j - 1)) {
                    arrayA[i][j] = 1;
                }
            }
        }
        return arrayA;
    }

    static int[][] calcArrayB(int k, int l) {
        int[][] arrayB = new int[k][l];
        for (k = 0; k < arrayB.length; k++) {
            for (l = 0; l < arrayB.length; l++) {
                if (k == l | k == (arrayB.length - l - 1) | k == ((arrayB.length - 1) / 2) | l == ((arrayB.length - 1) / 2)) {
                    arrayB[k][l] = 1;
                }
            }
        }
        return arrayB;
    }

    static int[][] calcArrayV(int m, int n) {
        int[][] arrayV = new int[m][n];
        for (m = 0; m < arrayV.length; m++) {
            for (n = 0; n < arrayV.length; n++) {
                if (n - m >= 0 & m <= arrayV.length - n - 1 | n - m <= 0 & m >= arrayV.length - n - 1) {
                    arrayV[m][n] = 1;
                }
            }
        }
        return arrayV;
    }

    private static void print(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++)
                System.out.print(ints[j] + " ");
            System.out.println();
        }
    }
}