/*Составить программу вывода на экран числа, вводимого с клавиатуры.
 *Выводимому числу должно предшествовать сообщение "Вы ввели число".*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH01N003 {
    public static void main(String[] args) {
        printNumber(enterNumber());
    }

    private static void printNumber(double number) {
        System.out.println("_________________________");
        System.out.println("You entered number : " + number);
    }

    private static double enterNumber() {
        System.out.print("Enter any number: ");
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}