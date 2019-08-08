/*Составить программу, которая печатает заданное слово, начиная с последней буквы.*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH09N042 {
    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        Scanner scanWord = new Scanner(System.in);
        String word = scanWord.nextLine();
        System.out.println("Reverse word will be: " + reverseWord(word));
    }

    static String reverseWord(String word) {
        StringBuilder strBuilderWord = new StringBuilder(word);
        return strBuilderWord.reverse().toString();
    }
}