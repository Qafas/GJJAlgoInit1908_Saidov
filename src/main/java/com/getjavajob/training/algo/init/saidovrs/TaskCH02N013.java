/*Дано трехзначное число. Найти число, полученное при прочтении его цифр
 *справа налево.
 */
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

public class TaskCH02N013 {
    public static void main(String[] args) {
        int number;
        do {
            System.out.print("Enter any natural number from 100 to 200: ");
            Scanner scann = new Scanner(System.in);
            number = scann.nextInt();
        } while (number < 100 || number > 199);
        int reverseNumber = calculateRevertNumber(number);
        System.out.print("Revert number from " + number + " will be: " + reverseNumber);
    }

    public static int calculateRevertNumber(int number) {
        //n=123
        int n2 = number / 10;//=12
        int c2 = n2 * 10; //=120
        int x3 = number - c2; //=3
        int x1 = number / 100; // =1
        int c1 = x1 * 100; //=100
        int x2 = (number - c1 - x3) / 10; //=2
        return x3 * 100 + x2 * 10 + x1;
    }
}