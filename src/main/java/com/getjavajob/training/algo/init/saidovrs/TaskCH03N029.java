/*3.29. Записать условие, которое является истинным, когда:
 *а) каждое из чисел X и Y нечетное;
 *б) только одно из чисел X и Y меньше 20;
 *в) хотя бы одно из чисел X и Y равно нулю;
 *г) каждое из чисел X, Y, Z отрицательное;
 *д) только одно из чисел X, Y и Z кратно пяти;
 *е) хотя бы одно из чисел X, Y, Z больше 100.
 */

package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

/**
 * Class with solution of a TaskCH03N029.
 *
 * @version 1.0
 * @autor Rustam Saidov
 */
public class TaskCH03N029 {
    /**
     * Main method of the task. Create 3 objects: X, Y and Z and get their values form keyboard
     */
    public static void main(String[] args) {
        System.out.println("Enter value X:");
        Scanner scanX = new Scanner(System.in);
        int x = scanX.nextInt();
        System.out.println("Enter value Y:");
        Scanner scanY = new Scanner(System.in);
        int y = scanY.nextInt();
        System.out.println("Enter value Z:");
        Scanner scanZ = new Scanner(System.in);
        int z = scanZ.nextInt();
        System.out.println("Task a, which true if X and Y are odd: " + taskA(x, y));
        System.out.println("Task b, which true if only one of a numbers less or equal than 20: " + taskB(x, y));
        System.out.println("Task v, which true if at least one of a numbers is equal to 0: " + taskV(x, y));
        System.out.println("Task g, which true if every number (X, Y, Z) negative: " + taskG(x, y, z));
        System.out.println("Task d, which true if only one of a numbers multiple of 5: " + taskD(x, y, z));
        System.out.println("Task e, which true if at least one of a numbers more than 100: " + taskE(x, y, z));
    }

    /**
     * Method, returning boolean true if X and Y are odd
     * @param x parameter x
     * @param y parameter y
     * @return Returns the logical result of comparing the expression with the given values of the input parameters
     */
    static boolean taskA(int x, int y) {
        return x % 2 != 0 && y % 2 != 0;
    }

    /**
     * Method, returning boolean true if only one of a numbers less or equal than 20
     * @param x parameter x
     * @param y parameter y
     * @return Returns the logical result of comparing the expression with the given values of the input parameters
     */
    static boolean taskB(int x, int y) {
        return x <= 20 ^ y <= 20;
    }

    /**
     * Method, returning boolean true if at least one of a numbers is equal to 0
     * @param x parameter x
     * @param y parameter y
     * @return Returns the logical result of comparing the expression with the given values of the input parameters
     */
    static boolean taskV(int x, int y) {
        return x == 0 || y == 0;
    }

    /**
     * Method, returning boolean true if every number (X, Y, Z) negative
     * @param x parameter x
     * @param y parameter y
     * @param z parameter y
     * @return Returns the logical result of comparing the expression with the given values of the input parameters
     */
    static boolean taskG(int x, int y, int z) {
        return x < 0 && y < 0 && z < 0;
    }

    /**
     * Method, returning boolean true if only one of a numbers multiple of 5
     * @param x parameter x
     * @param y parameter y
     * @param z parameter y
     * @return Returns the logical result of comparing the expression with the given values of the input parameters
     */
    static boolean taskD(int x, int y, int z) {
        boolean multipleXEqualZero = x % 5 == 0;
        boolean multipleYEqualZero = y % 5 == 0;
        boolean multipleZEqualZero = z % 5 == 0;
        boolean allMultipleEqualZero = multipleXEqualZero && multipleYEqualZero && multipleZEqualZero;
        return multipleXEqualZero ^ multipleYEqualZero ^ multipleZEqualZero ^ allMultipleEqualZero;
    }

    /**
     * Method, returning boolean true if at least one of a numbers more than 100
     * @param x parameter x
     * @param y parameter y
     * @param z parameter y
     * @return Returns the logical result of comparing the expression with the given values of the input parameters
     */
    static boolean taskE(int x, int y, int z) {
        return x > 100 || y > 100 || z > 100;
    }
}