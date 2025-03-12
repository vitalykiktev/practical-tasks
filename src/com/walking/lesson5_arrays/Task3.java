package com.walking.lesson5_arrays;

import java.util.Arrays;

/**
 * Вычислить из записать в массив первые 10 простых чисел.
 * Простое число – положительное целое число,
 * которое делится без остатка лишь на себя и на 1.
 * 1 не является простым числом.
 * Вывести в консоль сумму всех элементов полученного массива.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];
        primeNumbers[0] = 2;

        for (int i = 1; i < primeNumbers.length; i++) {

            int add = i == 1 ? 1 : 2;
            int num = primeNumbers[i - 1] + add;

            boolean isPrime;

            do {
                isPrime = true;
                double sqrtNum = Math.sqrt(num);

                for (int j = 0; j < i && primeNumbers[j] <= sqrtNum; j++) {
                    if (num % primeNumbers[j] == 0) {
                        num += add;
                        isPrime = false;
                        break;
                    }
                }
            } while (!isPrime);

            primeNumbers[i] = num;
        }

        int result = 0;

        for (int i : primeNumbers) {
            result += i;
        }

        System.out.println(result);
    }
}
