package com.walking.lesson4_cycles;

import java.util.Scanner;

/**
 * Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
 * Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”.
 * Углы прямоугольника обозначить символом “ “.
 * Каждая единица длины должна обозначаться одним символом “-“,
 * каждая единица ширины – символом “|“.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length: ");
        int length = in.nextInt();

        System.out.println("Enter width: ");
        int width = in.nextInt();

        String horizontalLine = " ";

        for (int i = 1; i <= length; i++) {
            horizontalLine += "-";
        }

        horizontalLine += " \n";

        String verticalLineUnit = "|";

        for (int i = 1; i <= length; i++) {
            verticalLineUnit += " ";
        }

        verticalLineUnit += "|\n";

        String verticalLines = "";

        for (int i = 1; i <= width; i++) {
            verticalLines += verticalLineUnit;
        }

        System.out.println(horizontalLine + verticalLines + horizontalLine);
    }
}
