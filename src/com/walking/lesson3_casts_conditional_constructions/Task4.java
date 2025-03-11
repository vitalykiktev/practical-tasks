package com.walking.lesson3_casts_conditional_constructions;

import java.util.Scanner;

/**
 * Ввести с клавиатуры два целых числа.
 * Если первое – четное ИЛИ второе – кратно трем,
 * вывести в консоль результат сравнения этих чисел.
 * <p>
 * Если первое число кратно и двум, и трем – вывести на экран число один,
 * возведенное в степень N, где N – второе число.
 * Для возведения в степень можно использовать Math.pow().
 * В случае, если результат выражения выходит за пределы типа int
 * (допустимые значения - [-2147483648; 2147483647]) –
 * вывести сообщение «Результат выражения слишком большой!»
 * <p>
 * Также максимальное и минимальное значение int содержится в константах
 * Integer.MIN_VALUE и Integer.MAX_VALUE соответственно.
 */
public class Task4 {
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
            double result = Math.pow(a, b);

            if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
                System.out.println("Результат выражения слишком большой!");
            } else {
                System.out.println(result);
            }
        }
    }
}
