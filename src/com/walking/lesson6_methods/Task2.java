package com.walking.lesson6_methods;

import java.util.Scanner;

/**
 * Декомпозировать задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/lesson3/Task4.java">...</a>
 * Вынести в отдельный метод логику, которая отрабатывает,
 * когда первое число кратно и двум, и трем.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter integer a: ");
        int a = in.nextInt();

        System.out.print("Enter integer b: ");
        int b = in.nextInt();

        if (a % 2 == 0 || b % 3 == 0) {
            System.out.println(a == b);
        }

        if (a % 6 == 0) {
            isMultipleSix(a, b);
        }
    }

    static void isMultipleSix(int a, int b) {
        double result = Math.pow(a, b);

        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            System.out.println("Результат выражения слишком большой!");
        } else {
            System.out.println(result);
        }
    }
}
