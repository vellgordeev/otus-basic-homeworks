package ru.gordeev.homeworks.homework7;

import static ru.gordeev.homeworks.homework7.TerrainType.*;

public class Tests {

    public static void main(String[] args) {
        Human human = new Human("Valentin", 10);
        Bike bike = new Bike();
        Car car1 = new Car(100);
        Car invalidCar = new Car(-100);
        Horse horse = new Horse(10);
        Horse weakHorse = new Horse(0);
        Rover invalidRover = new Rover(-100);
        Rover rover = new Rover(100);

        bike.setDriver(human);
        car1.setDriver(human);
        invalidCar.setDriver(human);
        horse.setDriver(human);
        weakHorse.setDriver(human);
        invalidRover.setDriver(human);
        rover.setDriver(human);

        human.setTransport(car1);
        human.move(100, FLATLAND);

        human.setTransport(horse);
        human.move(20, DEEP_FOREST);

        human.setTransport(rover);
        human.move(30, SWAMP);

        human.setTransport(bike);
        human.move(20, FLATLAND);

        human.setTransport(invalidCar);
        human.move(100, FLATLAND);

        human.setTransport(weakHorse);
        human.move(20, DEEP_FOREST);

        human.setTransport(invalidRover);
        human.move(30, SWAMP);

        human.setTransport(bike);
        human.move(-20, FLATLAND);
    }
}
