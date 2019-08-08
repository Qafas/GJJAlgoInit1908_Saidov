/*2.31. В трехзначном числе x зачеркнули его вторую цифру. Когда к образованному
 *при этом двузначному числу справа приписали вторую цифру числа x, то получилось число n.
 *По заданному n найти число x (значение n вводится с клавиатуры, 100 ≤ n ≤ 999).
 */
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH02N031 {
    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Enter any natural number from 100 to 999: ");
            Scanner scanN = new Scanner(System.in);
            n = scanN.nextInt();
        } while (n < 100 || n > 999);
        int x = exchangeTwoLastNumbers(n);
        System.out.println("Initial number from number " + n + " was: " + x);
    }

    static int exchangeTwoLastNumbers(int n) {
        //n=123
        int n2 = n / 10;//=12
        int c2 = n2 * 10; //=120
        int x3 = n - c2; //=3
        int x1 = n / 100; // =1
        int c1 = x1 * 100; //=100
        int x2 = (n - c1 - x3) / 10; //=2
        return x1 * 100 + x3 * 10 + x2;//n=132
    }
}