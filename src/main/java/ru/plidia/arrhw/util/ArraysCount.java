package ru.plidia.arrhw.util;

public class ArraysCount {
    public static void evenNumbers() {
        int[] arr = {4, 7, 6, 9, 3, 5, 13, 34, 67, 0};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Количество четных чисел: " + count);
        oddNumbers(arr);
    }

    public static void oddNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("Количество нечетных чисел: " + count);
    }

    public static void primeNumbers() {
        int[] arr = {5, 7, 8, 9, 3, 5, 4, 2, 1, 12};
        int i = 0;
        int count = 0;
        while (i < arr.length) {
            if (arr[i] > 1) {
                float num1 = (float) arr[i] % 2;
                float num2 = (float) arr[i] % 3;
                if (arr[i] <= 3) {
                    count++;
                } else if (num1 != 0 && num2 != 0) {
                    count++;
                }
            }
            i++;
        }
        System.out.println("Колличество простых чисел в массиве: " + count);
    }

    public static void sum() {
        int[] arr = {4, 7, 5, 2, 4, 9, 5, 7, 3, 5};
        int indexFirst = 0;
        int indexSecond = 1;
        int sum = 0;
        int result = 0;
        while (indexSecond < arr.length) {
            result = sum + arr[indexFirst] + arr[indexSecond];
            sum = result;
            indexFirst = indexFirst + 2;
            indexSecond = indexSecond + 2;
        }
        System.out.println("Сумма всех чисел: " + result);
    }

    public static void diff() {
        int[] arr = {5, 7, 8, 6, 2, 4, 13, 15, 2, 10};
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum1 = sum1 + arr[i];
            } else {
                sum2 = sum2 + arr[i];
            }
        }
        System.out.println("Разность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в массиве: " + (sum1 - sum2));
    }

    public static void countZero() {
        int[] arr = {6, 9, 0, 4, 6, 0, 90, 6, 3, 8};
        int i = 0;
        int count = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                count++;
            }
            i++;
        }
        System.out.println("Всего нулей в массиве: " + count);
    }
}
