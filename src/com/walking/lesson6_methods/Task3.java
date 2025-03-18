package com.walking.lesson6_methods;

import java.util.Scanner;

/**
 * Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
 * Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”.
 * Углы прямоугольника обозначить символом “ “.
 * Каждая единица длины должна обозначаться одним символом “-“,
 * каждая единица ширины – символом “|“.
 * <p>
 * Произвести декомпозицию по своему усмотрению. Рекомендую скинуть на проверку. Контакт ниже.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = scanner.nextInt();

        if (!isOneOrMore(length)) {
            return;
        }

        System.out.println("Enter width: ");
        int width = scanner.nextInt();

        if (!isOneOrMore(width)) {
            return;
        }

        String horizontalLine = createHorizontalLine(length, "-");
        String verticalLines = createVerticalLines(width, length, "|");

        System.out.println(horizontalLine + verticalLines + horizontalLine);
    }

    static String createHorizontalLine(int length, String symbol) {
        String horizontalLine = " ";
        for (int i = 1; i <= length; i++) {
            horizontalLine += symbol;
        }

        return horizontalLine + " \n";
    }

    static String createVerticalLines(int width, int length, String symbol) {
        String verticalLines = "";

        for (int i = 1; i <= width; i++) {
            verticalLines += createVerticalLineUnit(length, symbol);
        }

        return verticalLines;
    }

    static String createVerticalLineUnit(int length, String symbol) {
        String unit = symbol;

        for (int i = 1; i <= length; i++) {
            unit += " ";
        }

        return unit + "|\n";
    }

    static boolean isOneOrMore(int value) {
        return value >= 1;
    }
}
