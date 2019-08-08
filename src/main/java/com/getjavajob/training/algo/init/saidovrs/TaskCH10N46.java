/*Даны первый член и знаменатель геометрической прогрессии. Написать ре-
курсивную функцию:
а) нахождения n-го члена прогрессии;
б) нахождения суммы n первых членов прогрессии.*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH10N46 {
    public static void main(String[] args) {
        int firstElement, denominant, n;
        do {
            System.out.println("Enter the first element of geometrical progression: ");
            Scanner scanFirstElement = new Scanner(System.in);
            firstElement = scanFirstElement.nextInt();
            System.out.println("Enter denominant of geometrical progression: ");
            Scanner scanDenominant = new Scanner(System.in);
            denominant = scanDenominant.nextInt();
            System.out.println("Enter serial number of element of an geometrical progression, value of which you need to calculate: ");
            Scanner scanN = new Scanner(System.in);
            n = scanN.nextInt();
        } while (firstElement < 1 & denominant < 1);
        GeometricalProgression geomProgression = new GeometricalProgression(firstElement, denominant, n);
        System.out.println(n + " element of ariphmetical progression: will be: " +
                geomProgression.progressionMemberSearch(n));
        System.out.println("The summ of geometrical progression, consisting of " + n + " elements will be "
                + geomProgression.calcSummOfGeomProgression(n));
    }

    static class GeometricalProgression {
        final int firstElement;
        final int denominant;
        final int n;

        GeometricalProgression(int firstElement, int denominant, int n) {
            this.firstElement = firstElement;
            this.denominant = denominant;
            this.n = n;
        }

        private double progressionMemberSearch(int n) {
            if (n == 1) {
                return firstElement;
            }
            return denominant * progressionMemberSearch(n - 1);
        }

        private double calcSummOfGeomProgression(int n) {
            if (n == 1) {
                return progressionMemberSearch(n);
            }
            return progressionMemberSearch(n/*-1*/) + calcSummOfGeomProgression(n - 1);
        }
    }
}