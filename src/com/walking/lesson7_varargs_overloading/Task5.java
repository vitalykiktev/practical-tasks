package com.walking.lesson7_varargs_overloading;

/**
 * Вычислить из записать в массив первые 10 простых чисел.
 * <p>
 * Простое число – положительное целое число,
 * которое делится без остатка лишь на себя и на 1.
 * 1 не является простым числом.
 * <p>
 * Вывести в консоль сумму всех элементов полученного массива.
 * <p>
 * Нахождение простых чисел и вычисление суммы реализовать, используя рекурсивные методы.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[10];
        primeNumbers[0] = 2;

        for (int i = 1; i < primeNumbers.length; i++) {

            int addingValue = i == 1 ? 1 : 2;
            int numberToCheck = primeNumbers[i - 1] + addingValue;

            primeNumbers[i] = getPrimeNumber(numberToCheck, i, primeNumbers);

        }

        System.out.println(sumArrayRecursive(primeNumbers));
    }

    static int getPrimeNumber(int numberToCheck, int currentIndex, int[] primeNumbers) {
        boolean isPrime = isPrime(numberToCheck, currentIndex, primeNumbers);
        if (isPrime) {
            return numberToCheck;
        }

        return getPrimeNumber(numberToCheck + 2, currentIndex + 1, primeNumbers);
    }

    static boolean isPrime(int numberToCheck, int currentIndex, int[] primeNumbers) {
        int sqrt = (int) Math.sqrt(numberToCheck);

        for (int j = 0; j < currentIndex && primeNumbers[j] <= sqrt; j++) {
            if (numberToCheck % primeNumbers[j] == 0) {
                return false;
            }
        }

        return true;
    }

    static int sumArrayRecursive(int[] primeNumbers) {
        return sumArrayRecursive(primeNumbers, 0);
    }

    static int sumArrayRecursive(int[] primeNumbers, int currentIndex) {
        if (currentIndex == primeNumbers.length - 1) {
            return primeNumbers[currentIndex];
        }
        return primeNumbers[currentIndex] + sumArrayRecursive(primeNumbers, currentIndex + 1);
    }
}
