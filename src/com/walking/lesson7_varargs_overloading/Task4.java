package com.walking.lesson7_varargs_overloading;

import java.util.Scanner;

/**
 * Вычислите результат выражения, используя рекурсивный алгоритм.
 * n — число, введенное с клавиатуры.
 * Для N < 1 — вывести соответствующее сообщение в консоль и завершить выполнение программы.
 * <p>
 * Выражение: √(1 + √(2 + ... + √n)))
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        double number = scanner.nextInt();

        System.out.println(nestedRadical(number));
    }

    static double nestedRadical (double n) {
        int counter = 1;

        if(n <= 0) {
            System.out.println("Please enter a positive number");
        }

        if(n == 1) {
            return 1;
        }

        return nestedRadical(n, counter);
    }

    static double nestedRadical (double n, int counter) {
        if(counter == n) {
            return Math.sqrt(counter);
        }

        return Math.sqrt(counter + nestedRadical(n,counter + 1));
    }
}
