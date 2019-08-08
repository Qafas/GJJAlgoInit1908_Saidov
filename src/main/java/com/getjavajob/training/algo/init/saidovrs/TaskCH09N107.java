/*Дано слово. Поменять местами первую из букв а и последнюю из букв о.
 *Учесть возможность того, что таких букв в слове может не быть.*/
package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH09N107 {
    public static void main(String[] args) {
        System.out.println("Enter the word in which you need to change the first letter A and the last letter O: ");
        Scanner scanInitialWord = new Scanner(System.in);
        String initialWord = scanInitialWord.nextLine();
        initialWord = initialWord.toLowerCase();
        System.out.println(exchangeChar(initialWord));
    }

    static String exchangeChar(String str) {
        StringBuilder strB = new StringBuilder(str);
        //find the index of the first occurrence of the character:
        int aFirst = strB.indexOf("a");
        int oLast = strB.lastIndexOf("o");
        if (aFirst == -1 || oLast == -1) {
            str = "There is no one or more required characters in the word.";
            strB = new StringBuilder(str);
        } else {
            strB.setCharAt(aFirst, 'o');
            strB.setCharAt(oLast, 'a');
        }
        return strB.toString();
    }
}