/*5.38. "Странный муж" . Некий мужчина отправляется на работу, которая находится на расстоянии 1 км от дома.
 *Дойдя до места работы, он вдруг вспоминает, что перед уходом забыл поцеловать жену, и поворачивает назад. Пройдя
 *полпути, он меняет решение, посчитав, что правильнее вернуться на работу. Пройдя 1/3 км по направлению к работе,
 *он вдруг осознает, что будет настоящим подлецом, если так и не поцелует жену. На этот раз, прежде чем изменить мнение,
 *он проходит 1/4 км. Так он продолжает метаться, и после N этапа, пройдя 1/N км, снова меняет решение.
 *Определить:
 *а) на каком расстоянии от дома будет находиться мужчина после 100-го этапа (если допустить, что такое возможно);
 *б) какой общий путь он при этом пройдет
 */
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH05N038 {
    private static final double DISTANCETOWORK = 1000;
    public static void main(String[] args) {
        System.out.print("Enter quantity of the stages: ");
        Scanner scan = new Scanner(System.in);
        int stageQuantity = scan.nextInt();
        System.out.println("After " + stageQuantity + " stages man will be at a distance of " + distanceFromHome(DISTANCETOWORK, stageQuantity) + " meters from home.");
        System.out.println("The covered distance after " + stageQuantity + " stage is: " + totalDistance(DISTANCETOWORK, stageQuantity) + " meters");
    }

    static double distanceFromHome(double DISTANCETOWORK, int stageQuantity) {
        double distanceFromHome = 0;
        for (int i = 0; i < stageQuantity; i = i + 2) {
            distanceFromHome += DISTANCETOWORK / (i + 1);
        }
        for (int i = 1; i < stageQuantity; i = i + 2) {
            distanceFromHome -= DISTANCETOWORK / (i + 1);
        }
        return distanceFromHome;
    }

    static double totalDistance(double DISTANCETOWORK, int stageQuantity) {
        double fullDistance = 0;
        for (int i = 0; i < stageQuantity; i++) {
            double distanceStepI = DISTANCETOWORK / (i + 1);
            fullDistance += distanceStepI;
        }
        return fullDistance;
    }
}