package ru.gordeev.homeworks.homework7;

public class Rover implements Movable {

    private Human driver;
    private int gas;


    public Rover(int gas) {
        this.gas = gas;
    }


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
        if (gas <= 0) {
            System.out.println("Никуда не поедем, пока не будет достаточно бензина!");
            return;
        }

        int tempGas = gas - distance / 3;
        if (tempGas <= 0) {
            System.out.println("Закончился бензин! Проехал на вездеходе расстояние: " + distance + " км. " +
                    "Тип местности: " + terrainType.getType());
            gas = 0;
            return;
        }

        gas -= distance / 3;
        System.out.println("Проехал на вездеходе расстояние: " + distance + " км. Тип местности: " + terrainType.getType());
    }
}
