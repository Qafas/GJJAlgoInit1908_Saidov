/*10.43. Написать рекурсивную функцию:
а) вычисления суммы цифр натурального числа;
б) вычисления количества цифр натурального числа.*/

package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH10N43 {
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("Enter any natural number: ");
            Scanner scann = new Scanner(System.in);
            number = scann.nextInt();
        } while (number < 0);
        Quantity quantity = new Quantity(number);
        int quantityNumber = quantity.calculateQuantity(number);
        int quantityNumberStat = quantity.calculateQuantity(number);
        System.out.println("Quantity of numbers in number " + number + " is equal to: " + quantityNumber);
        Summ summ = new Summ(number, quantityNumber, quantityNumberStat);
        System.out.println("Sum of number " + number + " is equal to: " + summ.calculateSum(quantityNumber));
    }

    static class Quantity {
        final int number;

        Quantity(int number) {
            this.number = number;
        }

        private int calculateQuantity(int number) {
            if (number < 10) return 1;
            return calculateQuantity(number / 10) + 1;
        }
    }

    static class Summ {
        final int number;
        final int quantityNumber;
        final int quantityNumberStat;

        Summ(int number, int quantityNumber, int quantityNumberStat) {
            this.number = number;
            this.quantityNumber = quantityNumber;
            this.quantityNumberStat = quantityNumberStat;
        }

        private int calculateSum(int quantityNumber) {
            if (quantityNumber == 1) {
                return (int) ((number % (Math.pow(10, quantityNumberStat)) / Math.pow(10, quantityNumberStat - 1)));
            }
            return (int) (calculateSum(quantityNumber - 1) + ((number % (Math.pow(10, quantityNumberStat -
                    quantityNumber + 1)) / Math.pow(10, quantityNumberStat - quantityNumber))));
        }
    }
}