/*Даны первый член и разность арифметической прогрессии. Написать рекур-
сивную функцию для нахождения:
а) n-го члена прогрессии;
б) суммы n первых членов прогрессии.*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH10N45 {
    public static void main(String[] args) {
        System.out.println("Enter a first element of ariphmetical progression: ");
        Scanner scanFirstElement = new Scanner(System.in);
        int firstElement = scanFirstElement.nextInt();
        System.out.println("Enter difference of an ariphmetical progression: ");
        Scanner scanDifference = new Scanner(System.in);
        int difference = scanDifference.nextInt();
        System.out.println("Enter serial number of element of an ariphmetical progression, " +
                "value of which you need to calculate: ");
        Scanner scanN = new Scanner(System.in);
        int n = scanN.nextInt();
        AriphmetProgression ariphmetProgression = new AriphmetProgression(firstElement, difference, n);
        System.out.println(n + " element of ariphmetical progression: will be: "
                + ariphmetProgression.calculateAriphmetNumber(n));
        System.out.println("The summ of ariphmetical progression, consisting of " + n + " elements will be "
                + ariphmetProgression.calcAriphmetSumm(n));
    }

    static class AriphmetProgression {
        final int firstElement;
        final int difference;
        final int n;

        AriphmetProgression(int firstElement, int difference, int n) {
            this.firstElement = firstElement;
            this.difference = difference;
            this.n = n;
        }

        private double calculateAriphmetNumber(int n) {
            if (n == 1) {
                return firstElement;
            }
            return difference + calculateAriphmetNumber(n - 1);
        }

        private double calcAriphmetSumm(int n) {
            if (n == 1) {
                return calculateAriphmetNumber(n);
            }
            return calculateAriphmetNumber(n) + calcAriphmetSumm(n - 1);
        }
    }
}