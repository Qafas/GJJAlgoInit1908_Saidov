/*Удалить из массива все повторяющиеся элементы, оставив их первые вхождения,
 *т. е. в массиве должны остаться только различные элементы.*/

package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH11N158 {
    public static void main(String[] args) {
        System.out.println("Enter dimention of array: ");
        Scanner scanI = new Scanner(System.in);
        int i = scanI.nextInt();
        int[] initialArray = new int[i];
        System.out.println("Enter array element values: ");
        for (i = 0; i < initialArray.length; i++) {
            Scanner scan = new Scanner(System.in);
            initialArray[i] = scan.nextInt();
        }
        System.out.print("The initial array will be: ");
        for (i = 0; i < initialArray.length; i++) {
            System.out.print(initialArray[i] + "  ");
        }
        System.out.println();
        System.out.print("The cleaned array will be: ");
        initialArray = arrayCleaning(initialArray);
        for (i = 0; i < initialArray.length; i++) {
            System.out.print(initialArray[i] + "  ");
        }
    }

     static int[] arrayCleaning(int[] initialArray) {
        int[] tempArray = new int[initialArray.length];
        for (int item : initialArray) {
            for (int j = 0; j < initialArray.length; j++) {
                if (initialArray[j] == item) {
                    tempArray[j] = item;
                }
                if (initialArray[j] == item) {
                    break;
                }
            }
        }
        int nullNumber = 0;
        for (int i = 0; i < initialArray.length; i++) {
            if (tempArray[i] == 0) {
                nullNumber += 1;
            }
        }
        int cleanedElementNumber = 0;
        int[] cleanedArray = new int[tempArray.length - nullNumber];
        for (int value : tempArray) {
            if (value != 0) {
                cleanedArray[cleanedElementNumber] = value;
                cleanedElementNumber++;
            }
        }
        return cleanedArray;
    }
}