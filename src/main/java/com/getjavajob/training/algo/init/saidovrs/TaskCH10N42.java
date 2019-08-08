/*10.42. В некоторых языках программирования (например, в Паскале) не преду-смотрена операция
 *возведения в степень. Написать рекурсивную функцию для расчета степени n вещественного
 *числа a (n — натуральное число).
 */
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH10N42 {
    public static void main(String[] args) {
        System.out.println("Enter any number, which degree need to calculate: ");
        Scanner scanN = new Scanner(System.in);
        int n = scanN.nextInt();
        System.out.println("Enter degree of a number: ");
        Scanner scanDegree = new Scanner(System.in);
        int degree = scanDegree.nextInt();
        Pow pow = new Pow(degree, n);
        System.out.println("Number " + n + "  at degree " + degree + " is equal to: " + pow.calculatePow(degree));
    }

    private static class Pow {
        final int degree;
        final int n;

        Pow(int degree, int n) {
            this.degree = degree;
            this.n = n;
        }

        private int calculatePow(int degree) {
            if (degree == 0) {
                return 1;
            }
            return calculatePow(degree - 1) * n;
        }
    }
}