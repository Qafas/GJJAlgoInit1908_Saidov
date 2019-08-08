/*Составить программу, которая ведет учет очков, набранных каждой командой при игре в баскетбол.
Количество очков, полученных командами в ходе игры, может быть равно 1, 2 или 3.
После любого изменения счет выводить на экран.
После окончания игры выдать итоговое сообщение и указать номер команды-победительницы.
Окончание игры условно моделировать вводом количества очков, равного нулю.*/

package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

import static com.getjavajob.training.algo.init.saidovrs.Game.result;

class TaskCH06N087 {
    public static void main(String[] args) {
        System.out.println("Enter the name of the first team: ");
        Scanner scanFirstTeamName = new Scanner(System.in);
        String firstTeamName = scanFirstTeamName.nextLine();
        System.out.println("Enter the name of the second team: ");
        Scanner scanSecondTeamName = new Scanner(System.in);
        String secondTeamName = scanSecondTeamName.nextLine();
        Game gameObject = new Game();
        gameObject.play();
        System.out.println(result(gameObject.firstTeamScore, gameObject.secondTeamScore, firstTeamName, secondTeamName));
    }
}

class Game {
    int firstTeamScore = 0;
    int secondTeamScore = 0;

    static int score(int intermediateScore) {
        int point;
        do {
            System.out.println("Enter the number of points scored(1, 2 or 3 points): ");
            Scanner scanp = new Scanner(System.in);
            point = scanp.nextInt();
        } while (point < 1 | point > 3);
        intermediateScore += point;
        return intermediateScore;
    }

    static String result(int firstTeamScore, int secondTeamScore, String firstTeamName, String secondTeamName) {
        String gameResult;
        if (firstTeamScore > secondTeamScore) {
            gameResult = "The game ended with the score: " + firstTeamScore + ":" + secondTeamScore + "." + " The winner is " + firstTeamName + ".";
        } else if (firstTeamScore < secondTeamScore) {
            gameResult = "The game ended with the score: " + firstTeamScore + ":" + secondTeamScore + "." + " The winner is  " + secondTeamName + ".";
        } else {
            gameResult = "The game ended with the score: " + firstTeamScore + ":" + secondTeamScore + "." + " Draw.";
        }
        return gameResult;
    }

    void play() {
        int number;
        do {
            System.out.println("Enter the number of the team that scored. If the end of the game - enter 0: ");
            Scanner scan = new Scanner(System.in);
            number = scan.nextInt();
            if (number == 1) {
                firstTeamScore = score(firstTeamScore);
            } else if (number == 2) {
                secondTeamScore = score(secondTeamScore);
            }
            System.out.println("Score of the game: " + firstTeamScore + ":" + secondTeamScore);
        } while (number != 0);
    }
}