package com.walking.lesson4_cycles;

import java.util.Scanner;

/**
 * Выводить на экран "Не угадал!" до тех пор,
 * пока с клавиатуры не будет введено число 1.
 * Запрашивать число с клавиатуры после выводом на экран "Не угадал!"
 */
public class Task5Var2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Didn't guess!");
            System.out.println("Enter an integer: ");
        } while (in.nextInt() != 1);
    }
}
