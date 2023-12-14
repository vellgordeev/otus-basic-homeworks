package ru.gordeev.homeworks.homework12;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File[] files = new File(".").listFiles();

        System.out.println("Список файлов в корневом каталоге: ");
        for (File file : Objects.requireNonNull(files)) {
            System.out.println(file.getName());
        }

        System.out.println("С каким файлом вы будете работать далее?");
        while (true) {
            String userChoice = scanner.nextLine();
            boolean isFileFound = false;

            for (File file : files) {
                if (file.getName().equals(userChoice)) {
                    outputContentFromFile(file);
                    isFileFound = true;

                    System.out.println("Перезаписать содержимое? 1 - да, 2 - нет");
                    int choice = scanner.nextInt();
                    scanner.nextLine(); // Необходимо, для того, чтобы корректно обработать следующий ввод

                    if (choice == 1) {
                        System.out.println("Текущее содержимое будет перезаписано, введите текст: ");
                        writeToFile(file, scanner.nextLine(), false);
                    } else {
                        System.out.println("Введите текст: ");
                        writeToFile(file, scanner.nextLine(), true);
                    }

                    break;
                }
            }

            if (isFileFound) {
                break;
            } else {
                System.out.println("Файл с таким именем не найден! Введите другое имя: ");
            }
        }

    }

    private static void outputContentFromFile(File file) {
        try (BufferedInputStream in = new BufferedInputStream(new FileInputStream(file.getPath()))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char) n);
                n = in.read();
            }
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeToFile(File file, String content, boolean append) {
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file.getPath(), append))) {
            out.write(content.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
