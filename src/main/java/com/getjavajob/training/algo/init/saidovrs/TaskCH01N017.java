package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH01N017 {
    public static void main(String[] args) {
        System.out.print("Enter the value of the variable a: ");
        Scanner scana = new Scanner(System.in);
        double a = scana.nextDouble();
        System.out.print("Enter the value of the variable b: ");
        Scanner scanb = new Scanner(System.in);
        double b = scanb.nextDouble();
        System.out.print("Enter the value of the variable c: ");
        Scanner scanc = new Scanner(System.in);
        double c = scanc.nextDouble();
        System.out.print("Enter the value of the variable d: ");
        Scanner scanx = new Scanner(System.in);
        double x = scanx.nextDouble();
        System.out.println("Value о=sq.root(1-sin^2(x))= " + calculateValueOfO(x));
        System.out.println("Value p=1/(sq.root(ax^2+bx^2+c))= " + calculateValueOfP(a, b, c, x));
        System.out.println("Value r=(sq.root(x+1)+sq.root(x-1))/2*sq.root(x)= " + calculateValueOfR(x));
        System.out.println("Value s=|x|+|x+1|= " + calculateValueOfS(x));
    }

    private static double calculateValueOfO(double x) {
        return Math.sqrt(1 - Math.pow(Math.sin(x), 2));
    }

    private static double calculateValueOfP(double a, double b, double c, double x) {
        return 1 / Math.sqrt((a * Math.pow(x, 2)) + (b * Math.pow(x, 2)) + c);
    }

    private static double calculateValueOfR(double x) {
        return (Math.sqrt(x + 1) + Math.sqrt(x - 1)) / (2 * Math.sqrt(x));
    }

    private static double calculateValueOfS(double x) {
        return Math.abs(x) + Math.abs(x + 1);
    }
}