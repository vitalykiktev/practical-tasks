package com.walking.lesson7_varargs_overloading;

/**
 * Реализовать методы «вычисления суммы» для всех примитивных типов, кроме void.
 * Возвращать:
 * <p>
 * Для числовых типов — тот же тип. Даже если это ведет к потере точности.
 * При угрозе потери данных — выводить сообщение в консоль и возвращать текущий результат
 * (для byte, short, int);
 * <p>
 * Для boolean — определение истинности всех переданных параметров,
 * принимая то, что их стоит объединять через логическое И;
 * <p>
 * Для char — строку, полученную в результате конкатенации всех переданных параметров.
 * <p>
 * Количество параметров может быть любым.
 * Используйте перегрузку — у всех методов должны быть одинаковые названия.
 */
public class Task2 {
    public static void main(String[] args) {
        System.out.println(calculatesSum((byte) 123, (byte) 123));
        System.out.println(calculatesSum((short) 123, (short) 123));
        System.out.println(calculatesSum(123, 123));
        System.out.println(calculatesSum(123L, 454543534L));
        System.out.println(calculatesSum(123.324f, 44234.34f));
        System.out.println(calculatesSum(123.3242, 123.6765));
        System.out.println(calculatesSum(false, true, true, true, true));
        System.out.println(calculatesSum('J', 'a', 'c', 'k'));
    }

    static byte calculatesSum(byte... bytes) {
        byte result = 0;

        for (byte b : bytes) {
            if (checkLimit(Byte.MIN_VALUE, Byte.MAX_VALUE, result, b)) {
                System.out.println("Type overflow");
                return result;
            }

            result += b;
        }

        return result;
    }

    static short calculatesSum(short... shorts) {
        short result = 0;

        for (short s : shorts) {
            if (checkLimit(Short.MIN_VALUE, Short.MAX_VALUE, result, s)) {
                System.out.println("Type overflow");
                return result;
            }

            result += s;
        }

        return result;
    }

    static int calculatesSum(int... ints) {
        int result = 0;

        for (int i : ints) {
            if (checkLimit(Integer.MIN_VALUE, Integer.MAX_VALUE, result, i)) {
                System.out.println("Type overflow");
                return result;
            }

            result += i;
        }

        return result;
    }

    static long calculatesSum(long... longs) {
        long result = 0;

        for (long l : longs) {

            result += l;
        }

        return result;
    }

    static float calculatesSum(float... floats) {
        float result = 0;

        for (float f : floats) {

            result += f;
        }

        return result;
    }

    static double calculatesSum(double... doubles) {
        double result = 0;

        for (double d : doubles) {

            result += d;
        }

        return result;
    }

    static boolean calculatesSum(boolean... booleans) {

        for (boolean b : booleans) {
            if (!b) {
                return false;
            }
        }

        return true;
    }

    static String calculatesSum(char... chars) {
        String result = "";

        for (char c : chars) {

            result += c;
        }

        return result;
    }

    static boolean checkLimit(long minLimit, long maxLimit, long currentResult, long nextValue) {
        return (nextValue > 0 && currentResult > maxLimit - nextValue)
                || (nextValue < 0 && currentResult < minLimit - nextValue);
    }
}
