package com.walking.lesson7_varargs_overloading;

import java.util.Scanner;

/**
 * Вычислите факториал введенного с клавиатуры целого числа, используя рекурсивный алгоритм.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your integer: ");
        int number = scanner.nextInt();

        if(number < 0) {
            System.out.println("Please enter a positive integer");
        }

        System.out.println(calculateFactorial(number));
    }

    static int calculateFactorial(int n) {
        if(n == 0) {
            return 1;
        }

        return n == 1 ? 1 : n * calculateFactorial(n - 1);
    }
}
