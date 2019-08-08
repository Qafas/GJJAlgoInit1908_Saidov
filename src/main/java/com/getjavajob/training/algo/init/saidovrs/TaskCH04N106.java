package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH04N106 {
    public static void main(String[] args) {
        byte monthNum;
        do {
            System.out.print("Enter the number of the month: ");
            Scanner scan = new Scanner(System.in);
            monthNum = scan.nextByte();
        } while (monthNum < 1 || monthNum > 12);
        System.out.println("Month " + monthNum + " is at " + calcSeason(monthNum));
    }

    static String calcSeason(byte monthNum) {
        String season;
        switch (monthNum) {
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                season = "spring";
                break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            default:
                season = "autumn";
                break;
        }
        return season;
    }
}