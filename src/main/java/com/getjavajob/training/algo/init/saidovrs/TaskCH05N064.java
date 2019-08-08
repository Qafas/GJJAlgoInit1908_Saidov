/*5.64. В области 12 районов. Известны количество жителей (в тысячах человек)
 *и площадь (в км2) каждого района. Определить среднюю плотность населения
 *по области в целом.*/

package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH05N064 {
    private static final int DISTRICTQUANTITY = 12;

    public static void main(String[] args) {
        double[] distSquare = new double[DISTRICTQUANTITY];
        double[] distPopulation = new double[DISTRICTQUANTITY];
        for (int i = 0; i < DISTRICTQUANTITY; i++) {
            System.out.println("Enter the area of the " + (i + 1) + " district:");
            Scanner scans = new Scanner(System.in);
            distSquare[i] = scans.nextDouble();
            System.out.println("Enter the population of the " + (i + 1) + " district:");
            Scanner scanp = new Scanner(System.in);
            distPopulation[i] = scanp.nextDouble();
        }
        System.out.println("Population dencity in the region is " + calcDensity(distSquare, distPopulation));
    }

    static double calcDensity(double[] distSquare, double[] distPopulation) {
        double totalSquare = 0;
        double totalPopulation = 0;
        for (int i = 0; i < DISTRICTQUANTITY; i++) {
            totalSquare += distSquare[i];
            totalPopulation += distPopulation[i];
        }
        return totalPopulation / totalSquare;
    }
}