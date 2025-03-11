package com.walking.lesson3_casts_conditional_constructions;

import java.util.Scanner;

/**
 * Написать программу, которая принимает строку с клавиатуры.
 * Если строка == "Hi" - вывести в консоль "Hello",
 * если Bye - Good bye,
 * если How are you - How are your doing.
 * Если любая другая строка - вывести Unknown message.
 * Сделать через if-else
 */
public class Task2IfElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String message = in.nextLine();

        if ("Hi".equals(message)) {
            System.out.println("Hello");
        } else if ("Bye".equals(message)) {
            System.out.println("Good bye");
        } else if ("How are you".equals(message)) {
            System.out.println("How are you doing");
        } else {
            System.out.println("Unknown message");
        }
    }
}
