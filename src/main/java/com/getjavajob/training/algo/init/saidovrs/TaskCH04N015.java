/*Известны год и номер месяца рождения человека, а также год и номер месяца
 *сегодняшнего дня (январь — 1 и т. д.). Определить возраст человека (число
 *полных лет). В случае совпадения указанных номеров месяцев считать, что
 *прошел полный год.
 */
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH04N015 {
    public static void main(String[] args) {
        System.out.print("Enter the number of the current month: ");
        Scanner scanCurrentMonth = new Scanner(System.in);
        int currentMonth = scanCurrentMonth.nextInt();
        System.out.print("Enter the number of the current year: ");
        Scanner scanCurrentYear = new Scanner(System.in);
        int currentYear = scanCurrentYear.nextInt();
        System.out.print("Enter the number of the birth month of a man: ");
        Scanner scanBirthMonth = new Scanner(System.in);
        int birthMonth = scanBirthMonth.nextInt();
        System.out.print("Enter the number of the birth year of a man: ");
        Scanner scanBirthYear = new Scanner(System.in);
        int birthYear = scanBirthYear.nextInt();
        System.out.println("A man is " + calcFullYears(currentMonth, currentYear, birthMonth, birthYear) + " years old.");
    }

    static int calcFullYears(int currentMonth, int currentYear, int birthMonth, int birthYear) {
        int monthDifference = currentMonth - birthMonth < 0 ? -1 : 0;
        return (currentYear - birthYear) + monthDifference;
    }
}