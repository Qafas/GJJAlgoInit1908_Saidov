/*
10.51. Определить результат выполнения следующих рекурсивных процедур при
n 5 :

а) алг Процедура1(арг цел n)
	нач
		если n > 0
			то
				вывод n
				Процедура1(n – 1)
		все
	кон

Если n=5, то процедура 1 будет возвращать значение 5, т.к. строка возврата значения n стоит раньше чем начало рекурсии, и она попросту не будет срабатывать.

б) алг Процедура2(арг цел n)
нач
	если n > 0
		то
			Процедура2(n – 1)
			вывод n
	все
кон

Если n=5, то в результате срабатывания рекурсии "Процедура2(n – 1)" n дойдет до состояния когда станет равным 0. Строка с рекурсией будет пропущена, и сработает следующая строка, которая вернет значение 0 как значение Процедуры 2.

в) алг Процедура3(арг цел n)
нач
	если n > 0
		то
			вывод n
			Процедура3(n – 1)
	вывод n
	все
кон

Если n=5, То процедура 3 будет возвращать значение 5, т.к. строка возврата значения n стоит раньше чем начало рекурсии, и она попросту не будет срабатывать.
 */

package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH10N51ActualOutputs {
    public static void main(String[] args) {
        System.out.print("Enter value of n (In task n=5): ");
        Scanner scanN = new Scanner(System.in);
        int n = scanN.nextInt();
        System.out.println("Answer of first procedure looks like: ");
        calculateProcedure1(n);
        System.out.println(" ");
        System.out.println("Answer of second procedure looks like: ");
        calculateProcedure2(n);
        System.out.println(" ");
        System.out.println("Answer of third procedure looks like: ");
        calculateProcedure3(n);
    }

    //--------------------------------------------------------------------------------
    private static void calculateProcedure1(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            calculateProcedure1(n - 1);
        }
    }

    private static void calculateProcedure2(int n) {
        if (n > 0) {
            calculateProcedure2(n - 1);
            System.out.print(n + " ");
        }
    }

    private static void calculateProcedure3(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            calculateProcedure3(n - 1);
            System.out.print(n + " ");
        }
    }
}