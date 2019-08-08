/*Дано слово. Верно ли, что оно начинается и оканчивается на одну и ту же букву?*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH09N017 {
    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        Scanner scanWord = new Scanner(System.in);
        String word = scanWord.nextLine();
        word = word.toLowerCase();
        char firstLetter = word.charAt(0);
        char lastLetter = word.charAt(word.length() - 1);
        System.out.println("First letter int the word is: " + firstLetter);
        System.out.println("Last letter int the word is: " + lastLetter);
        System.out.println("First and the last letter in the word are the same: " + compareLetters(firstLetter, lastLetter));

    }

    static boolean compareLetters(char firstLetter, char lastLetter) {
        return lastLetter == firstLetter;
    }
}