/*Дан массив. Переписать его элементы в другой массив такого же размера
следующим образом: сначала должны идти все отрицательные элементы,
а затем все остальные. Использовать только один проход по исходному
массиву.*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH11N245 {
    public static void main(String[] args) {
        System.out.print("Enter the value of the array length: ");
        Scanner scanLength = new Scanner(System.in);
        int lengthValue = scanLength.nextInt();
        int[] initialArray = new int[lengthValue];
        for (int i = 0; i < lengthValue; i++) {
            System.out.print("Enter the value of " + i + " array cell: ");
            Scanner scanCell = new Scanner(System.in);
            initialArray[i] = scanCell.nextInt();
        }

        System.out.print("The initial array will be: ");
        for (int item : initialArray) System.out.print(+item + " ");
        System.out.println();
        int[] sortedArray = arraySorting(initialArray);
        System.out.print("The sorted array will be: ");
        for (int value : sortedArray) System.out.print(+value + " ");
    }

    static int[] arraySorting(int[] initialArray) {
        for (int i = initialArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (initialArray[j] > initialArray[j + 1]) {
                    int temp = initialArray[j];
                    initialArray[j] = initialArray[j + 1];
                    initialArray[j + 1] = temp;
                }
            }
        }
        return initialArray;
    }
}