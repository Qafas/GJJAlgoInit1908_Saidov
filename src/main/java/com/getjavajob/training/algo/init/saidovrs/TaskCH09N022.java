/*Дано слово, состоящее из четного числа букв. Вывести на экран его первую половину, 
не используя оператор цикла.*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH09N022 {
    public static void main(String[] args) {
        String word;
        do {
            System.out.println("Enter a word with an even number of letters: ");
            Scanner scanWord = new Scanner(System.in);
            word = scanWord.nextLine();
        } while (word.length() % 2 != 0);
        System.out.println("First part of the word will be: " + halfWord(word));
    }

    static String halfWord(String word) {
        return word.substring(0, word.length() / 2);
    }
}