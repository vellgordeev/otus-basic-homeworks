package ru.gordeev.homeworks.homework8;

public class Main {

    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "3"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        System.out.println(sumStringArrayElements(array));
    }

    private static int sumStringArrayElements(String[][] array) {
        if (array.length != 4) {
            throw new AppArraySizeException("Неверное количество строк в массиве!");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new AppArraySizeException("Неверное количество столбцов в массиве!");
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int temp = Integer.parseInt(array[i][j]);
                    sum += temp;
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Неправильный формат данных в массиве!");
                }
            }
        }

        return sum;
    }
}
