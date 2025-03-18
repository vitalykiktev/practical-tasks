package com.walking.lesson6_methods;

import java.util.Scanner;

/**
 * Декомпозировать задачу
 * <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/lesson3/Task2SwitchCase.java">...</a>
 * Вынести в отдельный метод использование switch-case.
 * Также вынести в отдельный метод использование System.out.println
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String message = in.nextLine();

        printAnswer(message);
    }

    static void printAnswer(String message) {
        switch (message) {
            case "Hi":
                doPrint("Hello");
                break;
            case "Bye":
                doPrint("Good bye");
                break;
            case "How are you":
                doPrint("How are you doing");
                break;
            default:
                doPrint("Unknown message");
        }
    }

    static void doPrint(String text) {
        System.out.println(text);
    }
}

