package com.walking.lesson2_operators_console_io;

import com.sun.source.doctree.EscapeTree;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Введите с клавиатуры целые числа a и b.
 * Выведите на экран результат сравнения:
 * a3 > b2,       где a3 - a в кубе, b2 - b  в квадрате
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = in.nextInt();

        System.out.println("Введите число b: ");
        int b = in.nextInt();

        in.close();

        boolean result = a *  a * a > b * b;
        System.out.println(result);
    }
}
