/*2.43. Даны два целых числа a и b. Если a делится на b или b делится на a, то вывес-ти 1,
 *иначе — любое другое число. Условные операторы и операторы цикла не использовать.
 */
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH02N043 {
    public static void main(String[] args) {
        System.out.print("Enter the value of the variable a: ");
        Scanner scanA = new Scanner(System.in);
        double a = scanA.nextDouble();
        System.out.print("Enter the value of the variable b: ");
        Scanner scanB = new Scanner(System.in);
        double b = scanB.nextDouble();
        System.out.println("If a divided by b or b divided by a without remainder, then output 1. Else output any other value: ");
        System.out.println(dividingOfNumbersWithoutRemainder(a, b));
    }

    static double dividingOfNumbersWithoutRemainder(double a, double b) {
        double remainderOfA = a % b;
        double remainderOfB = b % a;
        double multiplyingOfRemainders = remainderOfA * remainderOfB;
        return multiplyingOfRemainders + 1;
    }
}