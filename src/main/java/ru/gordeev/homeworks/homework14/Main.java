package ru.gordeev.homeworks.homework14;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        double[] array = new double[100_000_000];

        long startTime = System.nanoTime();
        multithreadingCalculation(array);
        System.out.println((System.nanoTime() - startTime) / 1_000_000);

    }

    private static void oneThreadCalculation(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    private static void multithreadingCalculation(double[] array) throws InterruptedException {
        List<Thread> threadList = new ArrayList<>();
        int quarter = array.length / 4;

        threadList.add(new Thread(() -> {
            for (int i = 0; i < quarter; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        }));

        threadList.add(new Thread(() -> {
            for (int i = quarter; i < quarter * 2; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        }));

        threadList.add(new Thread(() -> {
            for (int i = quarter * 2; i < quarter * 3; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        }));

        threadList.add(new Thread(() -> {
            for (int i = quarter * 3; i < array.length; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
        }));

        for (Thread thread : threadList) {
            thread.start();
        }
        for (Thread thread : threadList) {
            thread.join();
        }
    }
}
