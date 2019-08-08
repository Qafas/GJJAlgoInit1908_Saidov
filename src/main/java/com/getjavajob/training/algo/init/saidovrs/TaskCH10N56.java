/*Написать рекурсивную функцию, определяющую, является ли заданное натуральное число простым
(простым называется натуральное число, большее 1, не имеющее других делителей, кроме единицы и самого себя).*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH10N56 {
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("Enter the number (except 0 and 1) to check if it is prime: ");
            Scanner scanNumber = new Scanner(System.in);
            number = scanNumber.nextInt();
        } while (number == 0 || number == 1);
        int numDublicate = number;
        System.out.print("Number " + number + " ");
        PrimeNumber primeNumber = new PrimeNumber(number, numDublicate);
        if (primeNumber.calcPrimeNumber(numDublicate) == 0) System.out.println(" is NOT PRIME");
        else System.out.println(" is PRIME");
    }

    static class PrimeNumber {
        final int number;
        final int numDublicate;

        PrimeNumber(int number, int numDublicate) {
            this.number = number;
            this.numDublicate = numDublicate;
        }

        private double calcPrimeNumber(int numDublicate) {
            if (numDublicate == 2) {
                return 2;
            }
            return (number % (numDublicate - 1)) * calcPrimeNumber(numDublicate - 1) / 10;
        }
    }
}