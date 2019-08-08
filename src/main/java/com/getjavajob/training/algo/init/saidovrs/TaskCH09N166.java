/*Дано предложение. Поменять местами его первое и последнее слово.*/

package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH09N166 {
    public static void main(String[] args) {
        System.out.println("Enter any sentence or phrase with more then one word: ");
        Scanner scanSentence = new Scanner(System.in);
        String sentence = scanSentence.nextLine();
        System.out.println("A sentence in which the first and last word is exchanged will be: ");
        System.out.println(exchangeFirstLastWord(sentence));
    }

    static String exchangeFirstLastWord(String sentence) {
        //divide the string into words and write them into an array:
        String[] words = sentence.split(" ");
        //assign the first word:
        String temp = words[0];
        //change the first word:
        words[0] = words[words.length - 1];
        //change the last word:
        words[words.length - 1] = temp;
        //Create a new line from the array with the already changed words:
        return String.join(" ", words);
    }
}