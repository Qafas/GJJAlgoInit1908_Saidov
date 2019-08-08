/*Написать рекурсивную процедуру для ввода с клавиатуры последовательно-
сти чисел и вывода ее на экран в обратном порядке (окончание последова-
тельности — при вводе нуля).*/
package com.getjavajob.training.algo.init.saidovrs;

class TaskCH10N53 {
    public static void main(String[] args) {
        int[] array = {1, 22, 333, 444, 5555, 6666};
        int numbersInArray = array.length - 1;
        System.out.print("Initial array looks like:");
        for (int value : array) {
            System.out.print(+value + " ");
        }
        System.out.println();
        ReverseArray reverseArray = new ReverseArray(array, numbersInArray);
        System.out.println("Reverse array looks like: " + reverseArray.calcRevereseArray(numbersInArray));
    }

    static class ReverseArray {
        final int[] array;
        final int numbersInArray;

        ReverseArray(int[] array, int numbersInArray) {
            this.array = array;
            this.numbersInArray = numbersInArray;
        }

        private String calcRevereseArray(int numbersInArray) {
            if (numbersInArray == 0){
                return "" + array[0];
            }
            return array[numbersInArray] + " " + calcRevereseArray(numbersInArray - 1);
        }
    }
}