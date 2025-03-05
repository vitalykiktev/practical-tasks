package com.walking.lesson2_operators_console_io;

import java.util.Scanner;

/**
 * Введите с клавиатуры вещественные числа a и b. Выведите на экран результат выражения
 * c = b*a*(a + b)/(a2),         где a2 - a в квадрате
 * Совпадает ли результат выражения, если a и b — переменные типа int
 * (для проверки не забудьте также использовать подходящий метод Scanner)?
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число а: ");
        double a = in.nextDouble();

        System.out.println("Введите число b: ");
        double b = in.nextDouble();

        in.close();

        double c = b * a * (a + b) / (a * a);
        System.out.println(c);
    }
}
