package ru.gordeev.homeworks.homework4;

public class Box {

    private final int length;
    private final int width;
    private final int height;
    private String color;
    private boolean isOpen;
    private String[] items;

    public Box(int length, int width, int height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
        this.isOpen = false;
        items = new String[10];
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void open() {
        this.isOpen = true;
        System.out.println("Вы открыли коробку");
    }

    public void close() {
        this.isOpen = false;
        System.out.println("Вы закрыли коробку");
    }

    public void addItem(String newItem) {
        if (isOpen) {
            for (int i = 0; i < items.length; i++) {
                if (items[i] == null) {
                    items[i] = newItem;
                    System.out.println("Предмет добавлен");
                    return;
                }
            }
            System.out.println("К сожалению, в коробке нет свободного места");
        } else {
            System.out.println("Прежде чем добавить предмет, нужно открыть коробку!");
        }
    }

    public void removeItem(String item) {
        if (isOpen) {
            for (int i = 0; i < items.length; i++) {
                if (items[i].equals(item)) {
                    items[i] = null;
                    System.out.println("Предмет убран из коробки");
                    return;
                }
            }
            System.out.println("К сожалению, в коробке такого предмета нет");
        } else {
            System.out.println("Прежде чем убрать предмет, нужно открыть коробку!");
        }
    }

    public void printInfo() {
        System.out.println("Box{" +
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", isOpen=" + isOpen +
                '}');
    }
}
