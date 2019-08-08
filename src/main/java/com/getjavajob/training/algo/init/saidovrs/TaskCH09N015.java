/*Дано слово. Вывести на экран его k-й символ.*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH09N015 {
    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        Scanner scanWord = new Scanner(System.in);
        String word = scanWord.nextLine();
        int k;
        do {
            System.out.println("Enter a position number of a symbol in a word:");
            Scanner scanK = new Scanner(System.in);
            k = scanK.nextInt();
        } while (k < 1 || k > word.length());
        System.out.println(k + " symbol in a word " + word + " will be " + calcCharPositionFromK(k, word));
    }

    static char calcCharPositionFromK(int k, String word) {
        return word.charAt(k - 1);
    }
}