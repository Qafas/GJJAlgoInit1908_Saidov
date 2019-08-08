/*10.49. Написать рекурсивную функцию для вычисления индекса максимального
элемента массива из n элементов.*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH10N49 {
    public static void main(String[] args) {
        System.out.print("Enter the value of the number of elements in the future array: ");
        Scanner scanN = new Scanner(System.in);
        int n = scanN.nextInt();
        int[] array = new int[n];
        System.out.print("Enter each element of the array in turn: ");
        for (int i = 0; i < n; i++) {
            Scanner scanarr = new Scanner(System.in);
            array[i] = scanarr.nextInt();
        }
        int numbersInArray = array.length - 1;
        System.out.print("The initial array looks like this:");
        for (int value : array) System.out.print(+value + " ");
        System.out.println();
        MaximalNumber maximalNumber = new MaximalNumber(array, numbersInArray);
        System.out.println("The maximum element of the array is: " + maximalNumber.calculateMaxNumber(numbersInArray));
        System.out.println("The index of the maximum element of the array will be: "
                + maximalNumber.calculateMaxIndex(numbersInArray));
    }

    static class MaximalNumber {
        final int[] array;
        final int numbersInArray;

        MaximalNumber(int[] array, int numbersInArray) {
            this.array = array;
            this.numbersInArray = numbersInArray;
        }

        private int calculateMaxNumber(int numbersInArray) {
            int result;
            if (numbersInArray == 0) {
                return array[0];
            }
            result = array[numbersInArray] - calculateMaxNumber(numbersInArray - 1);
            if (result > 0) {
                return array[numbersInArray];
            } else {
                return calculateMaxNumber(numbersInArray - 1);
            }
        }

        private int calculateMaxIndex(int numbersInArray) {
            int result;
            if (numbersInArray == 0) {
                return 0;
            }
            result = array[numbersInArray] - array[calculateMaxIndex(numbersInArray - 1)];
            if (result > 0) {
                return numbersInArray;
            } else {
                return calculateMaxIndex(numbersInArray - 1);
            }
        }
    }
}