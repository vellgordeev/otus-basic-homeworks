package ru.gordeev.homeworks.homework6;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(60);

        Cat[] cats = new Cat[6];
        cats[0] = new Cat("Barsik", 10);
        cats[1] = new Cat("Murzkin", 10);
        cats[2] = new Cat("Mus'ka", 15);
        cats[3] = new Cat("Maks", 15);
        cats[4] = new Cat("Slava", 10);
        cats[5] = new Cat("Mr.Black", 10);

        for (Cat cat : cats) {
            cat.eat(plate, cat.getAppetite());
            System.out.println(cat.getInfo());
            System.out.println("Еды в тарелке осталось: " + plate.getCurrentFood());
        }
    }
}
