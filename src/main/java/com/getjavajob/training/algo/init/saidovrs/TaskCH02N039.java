/*Даны целые числа h, m, s (0 < h ≤ 23, 0 ≤ m ≤ 59, 0 ≤ s ≤ 59), указывающие
 *момент времени: "h часов, m минут, s секунд". Определить угол (в градусах)
 *между положением часовой стрелки в начале суток и в указанный момент
 *времени.*/

package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH02N039 {
    private static final short HOURSINCLOCK = 12;
    private static final short HOURSANGLEINCLOCK = 30;
    private static final short SECANDMINANGLEINCLOCK = 6;
    private static final short DEGREESINCIRCLE = 360;
    private static final short SECANDMININCLOCK = 60;

    public static void main(String[] args) {
        System.out.println("Enter value of hours at format of HH: ");
        Scanner scanh = new Scanner(System.in);
        double hour = scanh.nextDouble();
        System.out.print("Enter value of minutes at format of MM: ");
        Scanner scanm = new Scanner(System.in);
        double minute = scanm.nextDouble();
        System.out.print("Enter value of secunds at format of SS: ");
        Scanner scans = new Scanner(System.in);
        double secund = scans.nextDouble();
        System.out.println("the rotation angle of the hour hand will be: "
                + calculateRotationAngle(hour, minute, secund));
    }

    static double calculateRotationAngle(double hour, double minute, double second) {
        double hourClock = hour % HOURSINCLOCK; //hc=6
        double angleHour = hourClock * HOURSANGLEINCLOCK; //6*30=180 degree
        float angleMinute = (float) (minute * SECANDMINANGLEINCLOCK); //6*30=180 degree
        float angleHourFromMinute = (angleMinute / DEGREESINCIRCLE) * HOURSANGLEINCLOCK; //(180/360)*30=15 degree
        float angleSecond = (float) (second * SECANDMINANGLEINCLOCK); //20*6=120 degree
        float angleHourFromSecond = (angleSecond / DEGREESINCIRCLE) * HOURSANGLEINCLOCK / SECANDMININCLOCK; //0,166
        return angleHour + angleHourFromMinute + angleHourFromSecond;
    }
}