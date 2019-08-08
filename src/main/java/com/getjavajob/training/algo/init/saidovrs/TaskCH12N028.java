/*Заполнить двумерный массив размером NxN (где N%2=1) так, как представлено на
рис. 12.4.
1  2  3  4  5
16 17 18 19 6
15 24 25 20 7
14 23 22 21 8
13 12 11 10 9
*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH12N028 {
    public static void main(String[] args) {
        int i;
        do {
            System.out.println("Enter odd dimentions of first array: ");
            Scanner scanI = new Scanner(System.in);
            i = scanI.nextInt();
        } while (i % 2 == 0);
        int halfLength=i/2;
        System.out.println("Two-dimentional array will be: ");
        print(calculationSelfClosingArray(i, i, halfLength));
    }

    static int[][] calculationSelfClosingArray(int i, int j, int halfLength) {
        int[][] array = new int[i][j];
        array[0][0] = 1;
        for (int k = 0; k<=halfLength; k++) {
            for (i = 0; i < array.length; i++) {
                for (j = 1; j < array.length; j++) {

                    if (i <= j & j <= (array.length - i - 1))
                        array[i][j] = array[i][j - 1] + 1;
                    if (i <= j & j > array.length - i - 1)
                        array[i][j] = array[i - 1][j] + 1;
                }
                for (j = array.length; j >= 0; j--) {
                    if (i > j && j >= array[0].length - i - 1)
                        array[i][j] = array[i][j + 1] + 1;
                }
            }
            for (i = array.length; i >= 0; i--) {
                for (j = array.length; j >= 0; j--) {
                    if (i > j & j < array.length - i - 1 & i != 0)
                        array[i][j] = array[i + 1][j] + 1;
                }
            }
        }
        return array;
    }

    private static void print(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(String.format("%-4d", ints[j]));
            }
            System.out.println();
        }
    }
}