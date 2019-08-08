/*4.115.*В некоторых странах Дальнего Востока (Китае, Японии и др.) использовался
(и неофициально используется в настоящее время) календарь, отличающийся
от применяемого нами. Этот календарь представляет собой 60-летнюю цик-
лическую систему. Каждый 60-летний цикл состоит из пяти 12-летних под-
циклов. В каждом подцикле года носят названия животных: Крыса, Корова,
Тигр, Заяц, Дракон, Змея, Лошадь, Овца, Обезьяна, Петух, Собака и Свинья.
Кроме того, в названии года фигурируют цвета животных, которые связаны
с пятью элементами природы — Деревом (зеленый), Огнем (красный), Зем-
лей (желтый), Металлом (белый) и Водой (черный). В результате каждое жи-
вотное (и его год) имеет символический цвет, причем цвет этот часто совер-
шенно не совпадает с его "естественной" окраской — Тигр может быть чер-
ным, Свинья — красной, а Лошадь — зеленой. Например, 1984 год — год
начала очередного цикла — назывался годом Зеленой Крысы. Каждый цвет
в цикле (начиная с зеленого) "действует" два года, поэтому через каждые
60 лет имя года (животное и его цвет) повторяется.
Составить программу, которая по заданному номеру года нашей эры n печа-
тает его название по описанному календарю в виде: "Крыса, Зеленый". Рас-
смотреть два случая:
а) значение n 1984;
б) значение n может быть любым натуральным числом.*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH04N115 {
    private static final int CYCLE = 60;
    private static final int COLOURCYCLE = 10;
    private static final int ANIMALCYCLE = 12;

    public static void main(String[] args) {
        System.out.println("Enter any year:  ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        System.out.println(calcAnimalAndColourByYear(year));
    }

    static String calcAnimalAndColourByYear(int year) {
        if (year < 4) {
            year = year % CYCLE + CYCLE;
        }
        int yearPosition = (year - 4) % CYCLE;
        String animalName = "";
        switch (yearPosition % ANIMALCYCLE) {
            case 0:
                animalName = "Крыса, ";
                break;
            case 1:
                animalName = "Корова, ";
                break;
            case 2:
                animalName = "Тигр, ";
                break;
            case 3:
                animalName = "Заяц, ";
                break;
            case 4:
                animalName = "Дракон, ";
                break;
            case 5:
                animalName = "Змея, ";
                break;
            case 6:
                animalName = "Лошадь, ";
                break;
            case 7:
                animalName = "Овца, ";
                break;
            case 8:
                animalName = "Обезьяна, ";
                break;
            case 9:
                animalName = "Петух, ";
                break;
            case 10:
                animalName = "Собака, ";
                break;
            case 11:
                animalName = "Свинья, ";
                break;
        }
        String colourName = "";
        switch (yearPosition % COLOURCYCLE) {
            case 0:
            case 1:
                colourName = "Зеленый.";
                break;
            case 2:
            case 3:
                colourName = "Красный.";
                break;
            case 4:
            case 5:
                colourName = "Желтый.";
                break;
            case 6:
            case 7:
                colourName = "Белый.";
                break;
            case 8:
            case 9:
                colourName = "Черный.";
                break;
        }
        return animalName + colourName;
    }
}