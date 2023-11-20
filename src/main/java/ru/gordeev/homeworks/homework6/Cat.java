package ru.gordeev.homeworks.homework6;

public class Cat {

    private String name;

    private int appetite;

    private boolean isFull;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFull() {
        return isFull;
    }

    public void eat(Plate plate, int amountOfFood) {
        if (plate == null) {
            System.out.println("Тарелка не может быть null");
            return;
        }
        if (amountOfFood <= 0) {
            System.out.println("Кол-во съеденной еды не может быть 0 или отрицательным числом");
            return;
        }

        if (plate.decreaseFood(amountOfFood)) {
            /* Для того, чтобы аппетит не становился отрицательным, приравниваем к 0: */
            appetite -= amountOfFood;
            if (appetite < 0) {
                appetite = 0;
            }
            isFull = true;
        } else {
            System.out.println("Коту не хватило еды и он не ел");
        }
    }

    public String getInfo() {
        if (isFull) {
            return "Кот " + name + " сыт, его аппетит равен " + appetite;
        } else {
            return "Кот " + name + " хочет есть, его аппетит равен: " + appetite;
        }
    }
}
