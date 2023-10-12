package ru.gordeev.homeworks.homework1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5: ");
        int number = scanner.nextInt();

        if (number == 1) {
            greetings();
        } else if (number == 2) {
            checkSign(new Random().nextInt(1000), new Random().nextInt(1000), new Random().nextInt(1000));
        } else if (number == 3) {
            selectColor();
        } else if (number == 4) {
            compareNumbers();
        } else {
            addOrSubtractAndPrint(new Random().nextInt(100), new Random().nextInt(100), new Random().nextBoolean());
        }
    }

    private static void greetings() {
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }

    private static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void selectColor() {
        int data = (int) (Math.random() * 30);

        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    private static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }

    }
}
