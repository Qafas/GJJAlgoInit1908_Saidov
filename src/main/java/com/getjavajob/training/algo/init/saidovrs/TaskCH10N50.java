/*
10.50. Написать рекурсивную функцию для вычисления значения так называемой
функции Аккермана для неотрицательных чисел n и m.
Функцию Аккермана называют дважды рекурсивной, т. к. сама функция и
один из ее аргументов определены через самих себя.
Найти значение функции Аккермана для
n=1, m=3.
 */
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH10N50 {
    public static void main(String[] args) {
        long m;
        do {
            System.out.print("Enter the value of argument m of the Ackerman function(m>=0):");
            Scanner scanM = new Scanner(System.in);
            m = scanM.nextInt();
        } while (m < 0);
        long n;
        do {
            System.out.print("Enter the value of argument n of the Ackerman function(n>=0): ");
            Scanner scanN = new Scanner(System.in);
            n = scanN.nextInt();
        } while (n < 0);
        AckermanFunction ackermanFunction = new AckermanFunction(m, n);
        System.out.println("The result of the Ackerman Function will be: " + ackermanFunction.calcAckermanFunction(m, n));
    }

    static class AckermanFunction {
        final long m;
        final long n;

        AckermanFunction(long m, long n) {
            this.m = m;
            this.n = n;
        }

        private long calcAckermanFunction(long m, long n) {
            if (m == 0) {
                return n + 1;
            }
            if (m > 0 & n == 0) {
                return calcAckermanFunction(m - 1, 1);
            } else {
                return calcAckermanFunction(m - 1, calcAckermanFunction(m, n - 1));
            }
        }
    }
}