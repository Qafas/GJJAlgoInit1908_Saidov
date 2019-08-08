/*10.52. Написать рекурсивную процедуру для вывода на экран цифр натурального
числа в обратном порядке.*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH10N52 {
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("Enter any natural number: ");
            Scanner scanNumber = new Scanner(System.in);
            number = scanNumber.nextInt();
        } while (number < 0);
        ReverseNumber reverseNumber = new ReverseNumber(number);
        System.out.println("Reverse number looks like: " + Integer.parseInt(reverseNumber.calculateReverseNum(number)));
    }

    static class ReverseNumber {
        final int number;

        ReverseNumber(int number) {
            this.number = number;
        }

        private String calculateReverseNum(int number) {
            String result = "";
            if (number < 10) {
                result = number + "";
                return result;
            }
            result += number % 10;
            return result + calculateReverseNum(number / 10);
        }
    }
}