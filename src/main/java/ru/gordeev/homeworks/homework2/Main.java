package ru.gordeev.homeworks.homework2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        pointBetweenElements(new int[]{5, 1, 3, 3, 3, 3});
    }

    /*
    Реализуйте метод, принимающий в качестве аргументов целое число и строку, и печатающий в
    консоль строку указанное количество раз;
     */
    private static void printString(int number, String string) {
        for (int i = 0; i < number; i++) {
            System.out.println(string);
        }
    }

    /*
    Реализуйте метод, принимающий в качестве аргумента целочисленный массив, суммирующий все
    элементы, значение которых больше 5, и печатающий полученную сумму в консоль;
     */
    private static void sumElementsInArrayAndPrintResult(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 5) {
                result += array[i];
            }
        }
        System.out.println(result);
    }

    /*
    Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный
    массив, метод должен заполнить каждую ячейку массива указанным числом;
     */
    private static void fillArrayWithNumber(int number, int[] array) {
        for (int i = 0, length = array.length; i < length; i++) {
            array[i] = number;
        }
    }

    /*
    Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный
    массив, увеличивающий каждый элемент массива на указанное число;
     */
    private static void incrementElementsBy(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += number;
        }
    }

    /*
    Реализуйте метод, принимающий в качестве аргумента целочисленный массив, и печатающий в
    консоль информацию о том, сумма элементов какой из половин массива больше;
     */
    private static void printLargerHalfSumInfo(int[] array) {
        int firstHalfSum = 0;
        int secondHalfSum = 0;

        for (int i = 0; i < array.length / 2; i++) {
            firstHalfSum += array[i];
        }

        for (int i = array.length / 2; i < array.length; i++) {
            secondHalfSum += array[i];
        }

        if (firstHalfSum > secondHalfSum) {
            System.out.println("Сумма чисел первой половины массива больше, чем сумма второй половины");
        } else {
            System.out.println("Сумма чисел второй половины массива больше, чем сумма первой половины");
        }
    }

    /*
    Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
    массив равный сумме входящих;
     */
    private static void sumArrays(int[]... arr) {
        int maxLengthOfArray = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length > maxLengthOfArray) {
                maxLengthOfArray = arr[i].length;
            }
        }

        int[] resultArray = new int[maxLengthOfArray];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                resultArray[j] += arr[i][j];
            }
        }

        System.out.println("Итоговый массив выглядит так: " + Arrays.toString(resultArray));
    }

    /*
    Реализуйте метод, проверяющий что есть “точка” в массиве, в которой сумма левой и правой части
    равны. “Точка находится между элементами”;
Пример: { 1, 1, 1, 1, 1, | 5 }, { 5, | 3, 4, -2 }, { 7, 2, 2, 2 }, { 9, 4 }
     */
    private static void pointBetweenElements(int[] arr) {
        int leftSum = arr[0];
        int rightSum = 0;
        for (int i = 1; i < arr.length; i++) {
            rightSum += arr[i];
        }

        for (int i = 1; i < arr.length; i++) {
            if (leftSum == rightSum) {
                System.out.println("Точка одинаковых сумм найдена! Между элементом под индексом " + (i - 1) + " и " + i);
                return;
            }
            leftSum += arr[i];
            rightSum -= arr[i];
        }

        System.out.println("Точки пересечения сумм нет :(");
    }

    /*
    Реализуйте метод, проверяющий что все элементы массива идут в порядке убывания или
    возрастания (по выбору пользователя)
     */
    private static void isSortedInOrder(int[] arr, boolean isAsc) {
        if (isAsc) {
            System.out.println("Проверяем, что массив " + Arrays.toString(arr) + " отсортирован в порядке возрастания...");
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("Массив не является отсортированным в порядке возрастания, так как элемент с индексом " + i + " больше, чем элемент с индексом " + (i + 1));
                    return;
                }
            }
            System.out.println("Массив отсортирован в порядке возрастания!");
        } else {
            System.out.println("Проверяем, что массив " + Arrays.toString(arr) + " отсортирован в порядке убывания...");
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    System.out.println("Массив не является отсортированным в порядке убывания, так как элемент с индексом " + i + " меньше, чем элемент с индексом " + (i + 1));
                    return;
                }
            }
            System.out.println("Массив отсортирован в порядке убывания!");
        }
    }

    /*
     Реализуйте метод, “переворачивающий” входящий массив
     Пример: { 1 2 3 4 } => { 4 3 2 1 }
     */
    private static int[] reverseArray(int[] arr) {
        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[arr.length - i - 1];
        }

        return newArray;
    }
}
