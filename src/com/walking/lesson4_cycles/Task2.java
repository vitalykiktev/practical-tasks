package com.walking.lesson4_cycles;

import java.util.Scanner;

/**
 * Ввести с клавиатуры целое число.
 * Вывести в консоль сумму цифр введенного числа.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a = in.nextInt();

        int result = 0;

        while (a != 0) {

           result += a % 10;
           a /= 10;
        }

        System.out.println(result);
    }
}
