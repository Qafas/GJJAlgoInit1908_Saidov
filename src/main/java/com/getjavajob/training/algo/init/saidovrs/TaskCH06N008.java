/*6.8. Дано число n. Из чисел 1, 4, 9, 16, 25, ... напечатать те,
 *которые не превышают n.*/

package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH06N008 {
    public static void main(String[] args) {
        System.out.print("Enter any natural number: ");
        Scanner scan = new Scanner(System.in);
        double n = scan.nextInt();
        print(comparisonN(n));
    }

     static int[] comparisonN(double n) {
        int root = (int) Math.sqrt(n);
        int[] array = new int[root + 1];
        for (int i = 0; i < root + 1; i++) {
            array[i] = i * i;
        }
        return array;
    }

     private static void print(int[] array) {
        int i;
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}