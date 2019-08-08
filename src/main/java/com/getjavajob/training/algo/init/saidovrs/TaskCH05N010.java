/*Напечатать таблицу перевода 1, 2, ... 20 долларов США в рубли по текущему курсу
 *(значение курса вводится с клавиатуры).
 * */
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH05N010 {
    public static void main(String[] args) {
        double[] dollarQuantity = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.print("Enter dollar rate: ");
        Scanner scan = new Scanner(System.in);
        double dollarRate = scan.nextDouble();
        System.out.println("Dollar conversion table according to the current exchange rate:");
        System.out.println("USD | RUB");
        for (int i = 0; i < 20; i++) {
            System.out.print("| " + dollarQuantity[i] + " | ");
            System.out.println(rubEquivalentPrice(i, dollarQuantity, dollarRate) + " |");
        }
    }

    static double rubEquivalentPrice(int i, double[] dollarQuantity, double dollarRate) {
        return dollarQuantity[i] * dollarRate;
    }
}