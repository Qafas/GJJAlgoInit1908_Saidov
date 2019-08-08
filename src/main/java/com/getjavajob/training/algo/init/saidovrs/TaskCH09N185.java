/*Строка содержит арифметическое выражение, в котором используются
 *круглые скобки, в том числе вложенные. Проверить, правильно ли в нем расставлены скобки.
 *а) Ответом должны служить слова да или нет.
 *б) В случае неправильности расстановки скобок:
 *если имеются лишние правые (закрывающие) скобки, то выдать сообщение с указанием позиции первой такой скобки;
 *если имеются лишние левые (открывающие) скобки, то выдать сообщение с указанием количества таких скобок.
 *Если скобки расставлены правильно, то сообщить об этом.*/


package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH09N185 {
    public static void main(String[] args) {
        System.out.println("Enter any arithmetic expression: ");
        Scanner scanExpression = new Scanner(System.in);
        String expression = scanExpression.nextLine();
        System.out.println(calcBracket(expression));
    }

    static String calcBracket(String expression) {
        //Count the number of character in the line:
        int openingBracket = 0;
        int closingBracket = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                openingBracket += 1;
            }
            if (expression.charAt(i) == ')') {
                closingBracket += 1;
            }
        }
        //Enter the condition of outputting the result depending on the number of characters in the line:
        String answer;
        if (openingBracket == closingBracket) {
            answer = "EXPRESSION IS CORRECT. The number of opening and closing brackets is equal.";
        } else if (openingBracket > closingBracket) {
            answer = "ERROR. The number of opening brackets more then closing brackets. Total amount of opening brackets is: " + openingBracket;
        } else {
            answer = "ERROR. The number of closing brackets more then opening brackets. First closing bracket is " + (expression.indexOf(')') + 1) + " in a row.";
        }
        return answer;
    }
}