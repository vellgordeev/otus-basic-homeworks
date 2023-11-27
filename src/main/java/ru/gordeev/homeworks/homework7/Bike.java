package ru.gordeev.homeworks.homework7;

import static ru.gordeev.homeworks.homework7.TerrainType.SWAMP;

public class Bike implements Movable {

    private Human driver;


    @Override
    public void setDriver(Human driver) {
        this.driver = driver;
    }

    public void unsetDriver() {
        setDriver(null);
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
        if (distance <= 0) {
            System.out.println("Дистанция должна быть положительным числом");
            return;
        }
        if (terrainType == SWAMP) {
            System.out.println("По болоту велосипедист не проедет!");
            return;
        }
        if (driver.getStamina() <= 0) {
            System.out.println("Никуда не поедем, пока велосипедист не наберется сил!");
            return;
        }

        int tempStamina = driver.getStamina() - distance / 5;
        if (tempStamina <= 0) {
            driver.setStamina(0);
            System.out.println("Велосипедист устал! Проехал на велосипеде расстояние: " + distance + " км. " +
                    "Тип местности: " + terrainType.getType());
            return;
        }

        driver.setStamina(tempStamina);
        System.out.println("Проехал на велосипеде расстояние: " + distance + " км. Тип местности: " + terrainType.getType());
    }

}
