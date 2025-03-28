package com.walking.lesson7_varargs_overloading;

/**
 * Написать программу, которая объединяет любое количество строк,
 * объединяя их через пробел.
 * Реализацию конкатенации строк вынести в отдельный метод.
 */
public class Task1 {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c", "d", "e", "f", "g", "h"};
        System.out.println(concatStrings(strings));
    }

    static String concatStrings(String ...string) {
        if(string.length == 0) {
            return "";
        }

        String result = "";

        for(String s : string) {
            result += " " + s;
        }
        return result;
    }
}
