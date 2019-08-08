/*10.41. Написать рекурсивную функцию для вычисления факториала натурального числа n.*/

package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH10N41 {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println("Enter the number whose factorial you want to calculate: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(" Factorial number of " + n + " is: " + factorial.calculateFact(n));
    }

    private static class Factorial {

        private int calculateFact(int n) {
            if (n == 1) {
                return 1;
            }
            return calculateFact(n - 1) * n;
        }
    }
}