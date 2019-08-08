/*Написать рекурсивную процедуру перевода натурального числа из десятичной системы счисления в N-ричную.
Значение N в основной программе вводится с клавиатуры (2 <=N<= 16).*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH10N55 {
    public static void main(String[] args) {
        System.out.print("Enter the number whose value in the N-decimal system you want to get: ");
        Scanner scanNumber = new Scanner(System.in);
        int number = scanNumber.nextInt();
        int n;
        do {
            System.out.print("Enter the bit depth of the N-bit system. (2 <= N <= 16): ");
            Scanner scanN = new Scanner(System.in);
            n = scanN.nextInt();
        } while (n < 2 | n > 16);
        Convertion convertion = new Convertion(number, n);
        System.out.println("Number: " + number + " at " + n + "-bit system will be: "
                + Integer.parseInt(convertion.convertionFromDecimal(number, n)));
    }

    static class Convertion {
        final int number;
        final int n;


        Convertion(int number, int n) {
            this.number = number;
            this.n = n;
        }

        private String convertionFromDecimal(int number, int n) {
            if (number < n) {
                return "" + number % n;
            }
            return convertionFromDecimal(number / n, n) + "" + number % n;
        }
    }
}