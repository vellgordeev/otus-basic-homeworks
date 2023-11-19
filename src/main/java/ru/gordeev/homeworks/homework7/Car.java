package ru.gordeev.homeworks.homework7;

import static ru.gordeev.homeworks.homework7.TerrainType.DEEP_FOREST;
import static ru.gordeev.homeworks.homework7.TerrainType.SWAMP;

public class Car implements Movable {

    private int gas;


    public Car(int gas) {
        this.gas = gas;
    }

    public int getGas() {
        return gas;
    }

    @Override
    public void move(TerrainType terrainType, int distance) {
        if (terrainType == null) {
            System.out.println("Нужно указать местность!");
            return;
        }
        if (terrainType == DEEP_FOREST || terrainType == SWAMP) {
            System.out.println("По густому лесу или болоту машина не проедет!");
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

        int tempGas = gas - distance / 5;
        if (tempGas <= 0) {
            System.out.println("Закончился бензин! Проехал на машине расстояние: " + distance + " км. " +
                    "Тип местности: " + terrainType.getType());
            gas = 0;
            return;
        }

        gas -= tempGas;
        System.out.println("Проехал на машине расстояние: " + distance + " км. Тип местности: " + terrainType.getType());
    }
}
