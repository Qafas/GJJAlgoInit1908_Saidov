/*Работа светофора для пешеходов запрограммирована следующим образом: в
 *начале каждого часа в течение трех минут горит зеленый сигнал, затем в те-
 *чение двух минут — красный, в течение трех минут — опять зеленый и т. д.
 *Дано вещественное число t, означающее время в минутах, прошедшее с нача-
 *ла очередного часа. Определить, сигнал какого цвета горит для пешеходов в
 *этот момент.*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH04N036 {
    public static void main(String[] args) {
        int t;
        do {
            System.out.println("Enter the quantity of minutes, passed from the beginning of the hour: ");
            Scanner scan = new Scanner(System.in);
            t = scan.nextInt();
        } while (t < 0 || t > 59);
        System.out.print("Now a ");
        System.out.println(calculateColour(t) ? "Green light is on." : "Red light is on.");
    }

    static boolean calculateColour(int t) {
        return t % 5 < 3;
    }
}		