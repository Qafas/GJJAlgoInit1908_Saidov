/*10.47. Написать рекурсивную функцию для вычисления k-го члена последователь-
 *ности Фибоначчи. Последовательность Фибоначчи f1, f2, ... образуется по
 *закону: f1=1; f2=1; fi =fi-1 + fi-2 ( i =3, 4, ...).
 */
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH10N47 {
    public static void main(String[] args) {
        System.out.println("Enter the serial number in the Fibonacci series whose value you want to return: ");
        Scanner scanK = new Scanner(System.in);
        int k = scanK.nextInt();
        Fibonacci fibonacci = new Fibonacci(k);
        System.out.println("The number with serial number: " + k + " in the Fibonacci row will be equal to:: "
                + fibonacci.calculateFib(k));
    }

    static class Fibonacci {
        final int k;

        Fibonacci(int k) {
            this.k = k;
        }

        private int calculateFib(int k) {
            if (k == 1) {
                return 1;
            }
            if (k == 0) {
                return 0;
            }
            return calculateFib(k - 1) + calculateFib(k - 2);
        }
    }
}