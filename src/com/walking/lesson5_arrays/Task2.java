package com.walking.lesson5_arrays;

import java.util.Scanner;

/**
 * Создать массив int’ов из 5 элементов.
 * Заполнить его значениями, введенными с клавиатуры.
 * Вывести на экран сумму каждого значения с предыдущим.
 * Предыдущим значением для 0го элемента считать последнее значение массива.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

            if (i != arr.length - 1) {
                System.out.println("Enter an integer: ");
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.println(arr[0] + arr[arr.length - 1]);
            } else {
                System.out.println(arr[i] + arr[i - 1]);
            }
        }
    }
}
