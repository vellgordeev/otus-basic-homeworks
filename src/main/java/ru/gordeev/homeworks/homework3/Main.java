package ru.gordeev.homeworks.homework3;

public class Main {

    public static void main(String[] args) {

    }

    /*
    Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
    метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0;
     */
    private static int calculateSumOfPositiveElements(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    sum += arr[i][j];
                }
            }
        }

        return sum;
    }

    /*
    Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат
    из символов * со сторонами соответствующей длины;
     */
    private static void printSquare(int size) {
        var arr = new int[size][size];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    /*
    Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив, и зануляющий его
    диагональные элементы (можете выбрать любую из диагоналей, или занулить обе);
     */
    private static void nullifyDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][arr.length - i - 1] = 0;
            }
        }
    }

    /*
    Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива;
     */
    private static int findMax(int[][] arr) {
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxElement) {
                    maxElement = arr[i][j];
                }
            }
        }

        return maxElement;
    }

    /*
    Реализуйте метод, который считает сумму элементов второй строки двумерного массива, если второй строки не
    существует, то в качестве результата необходимо вернуть -1
     */
    private static int calculateSecondRowSum(int[][] arr) {
        int sum = -1;

        if (arr.length > 1) {
            sum = 0;
            for (int i = 0; i < arr[1].length; i++) {
                sum += arr[1][i];
            }
        }

        return sum;
    }

}
