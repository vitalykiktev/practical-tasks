package com.walking.lesson4_cycles;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Ввести с клавиатуры целое число.
 * Вывести в консоль его факториал.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a = in.nextInt();

        if (a < 0) {
            System.out.println("Factorial cannot be less than zero");
        } else {
            int result = 1;

            for (int i = 1; i <= a; i++) {
                result *= i;
            }

            System.out.println(result);
        }
    }
}
