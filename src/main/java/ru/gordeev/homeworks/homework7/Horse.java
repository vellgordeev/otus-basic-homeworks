package ru.gordeev.homeworks.homework7;

import static ru.gordeev.homeworks.homework7.TerrainType.SWAMP;

public class Horse implements Movable {

    private Human driver;
    private int stamina;


    public Horse(int stamina) {
        this.stamina = stamina;
    }


    @Override
    public void setDriver(Human driver) {
        this.driver = driver;
    }

    public void unsetDriver() {
        setDriver(null);
    }

    public int getStamina() {
        return stamina;
    }

    @Override
    public void move(TerrainType terrainType, int distance) {
        if (driver == null) {
            System.out.println("Нужен человек для управления транспортным средством!");
            return;
        }
        if (terrainType == null) {
            System.out.println("Нужно указать местность!");
            return;
        }
        if (terrainType == SWAMP) {
            System.out.println("По болоту лошадь не пробежит!");
            return;
        }
        if (distance <= 0) {
            System.out.println("Дистанция должна быть положительным числом");
            return;
        }
        if (stamina <= 0) {
            System.out.println("Лошадь не может идти, она устала!");
        }

        int tempStamina = stamina - distance / 2;
        if (tempStamina <= 0) {
            stamina = 0;
            System.out.println("Лошадь устала! Пробежал на лошади расстояние: " + distance + " км. " +
                    "Тип местности: " + terrainType.getType());
            return;
        }

        stamina -= distance / 2;
        System.out.println("Пробежал на лошади расстояние: " + distance + " км. Тип местности: " + terrainType.getType());
    }
}
