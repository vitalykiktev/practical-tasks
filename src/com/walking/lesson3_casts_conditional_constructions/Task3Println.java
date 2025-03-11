package com.walking.lesson3_casts_conditional_constructions;

import java.util.Scanner;

/**
 * Завести три переменные типа String.
 * С клавиатуры ввести в них вашу фамилию, имя и отчество.
 * Вывести в консоль в одну строку ваше ФИО.
 * Сделать, используя System.out.println
 */
public class Task3Println {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your surname: ");
        String surname = in.nextLine();

        System.out.print("Enter your name: ");
        String name = in.nextLine();

        System.out.print("Enter your patronymic: ");
        String patronymic = in.nextLine();

        System.out.println(surname + " " + name + " " + patronymic);
    }
}
