/*4.67. Дано целое число k (1 k 365). Определить, каким будет k-й день года: вы-
 *ходным (суббота и воскресенье) или рабочим, если 1 января — понедельник.
 */

package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH04N067 {
    private static final int WEEK = 7;
    public static void main(String[] args) {
        int k;
        do {
            System.out.println("Enter a number of the day in year: ");
            Scanner scan = new Scanner(System.in);
            k = scan.nextInt();
        } while (k < 1 || k > 365);
        System.out.println("The " + k + " day in the year will be a " + dayStatus(k));
    }

    static String dayStatus(int k) {
        int dayInWeek = k % WEEK;
        return 1 <= dayInWeek && dayInWeek < 6 ? "Working day." : "Holiday.";
    }
}