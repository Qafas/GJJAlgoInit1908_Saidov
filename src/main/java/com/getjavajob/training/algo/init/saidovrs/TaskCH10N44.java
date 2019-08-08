/*Написать рекурсивную функцию нахождения цифрового корня натурального
числа. Цифровой корень данного числа получается следующим образом. Если сложить все цифры этого числа, затем все цифры найденной суммы
и повторять этот процесс, то в результате будет получено однозначное число
(цифра), которая и называется цифровым корнем данного числа*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH10N44 {
    public static void main(String[] args) {
        int number;
        do {
            System.out.println("Enter any natural number: ");
            Scanner scann = new Scanner(System.in);
            number = scann.nextInt();
        } while (number < 0);
        DigitalRoot digitalRoot = new DigitalRoot(number);
        System.out.println("Digital root of a number " + number + " is equal to: "
                + digitalRoot.caclulateDigitalRoot(number));
    }

    static class DigitalRoot {
        final int number;

        DigitalRoot(int number) {
            this.number = number;
        }

        private int calcDigitalSum(int number) {
            int result = 0;
            if (number < 10){
                return number;
            }
            result += number % 10;
            result += calcDigitalSum(number / 10);
            return result;
        }

        int caclulateDigitalRoot(int number) {
            number = calcDigitalSum(number);
            do {
                calcDigitalSum(number);
                number = calcDigitalSum(number);
            } while (number >= 10);
            return number;
        }
    }
}