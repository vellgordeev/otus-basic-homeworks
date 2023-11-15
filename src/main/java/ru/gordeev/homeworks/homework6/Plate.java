package ru.gordeev.homeworks.homework6;

public class Plate {

    private int maxFood;

    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        this.currentFood = maxFood;
    }

    public int getMaxFood() {
        return maxFood;
    }

    public int getCurrentFood() {
        return currentFood;
    }

    public boolean addFood(int amount) {
        if (amount <= 0) {
            System.out.println("Добавить отрицательное или нулевое кол-во еды нельзя");
            return false;
        }

        int temp = this.currentFood + amount;
        if (temp > maxFood || temp < 0) {
            System.out.println("Кол-во еды после добавления не может быть отрицательным, либо быть больше максимума тарелки");
            return false;
        }

        this.currentFood += amount;
        return true;
    }

    public boolean decreaseFood(int amount) {
        if (amount <= 0) {
            System.out.println("Уменьшить еду на 0 или отрицательное кол-во нельзя");
            return false;
        }

        int temp = currentFood - amount;
        if (temp < 0) {
            System.out.println("Кол-во еды в тарелке не может стать отрицательным после уменьшения");
            return false;
        } else {
            currentFood -= amount;
            return true;
        }

    }
}
