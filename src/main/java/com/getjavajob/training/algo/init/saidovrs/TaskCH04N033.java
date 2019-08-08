/*4.33. Дано натуральное число.
 *а) Верно ли, что оно заканчивается четной цифрой?
 *б) Верно ли, что оно заканчивается нечетной цифрой?
 *П р и ме ч а н и е
 *В обеих задачах составное условие не использовать*/

package com.getjavajob.training.algo.init.saidovrs;

import java.util.Scanner;

class TaskCH04N033 {
    public static void main(String[] args) {
        System.out.print("Enter any natural number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("The number ends with an even digit: " + Even(number));
        System.out.println("The number ends with an odd digit: " + Even(number + 1));
    }

    static boolean Even(int number) {
        return number % 2 == 0;
    }
}