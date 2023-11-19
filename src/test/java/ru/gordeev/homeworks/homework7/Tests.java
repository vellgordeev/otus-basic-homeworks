package ru.gordeev.homeworks.homework7;

public class Tests {

    public static void main(String[] args) {
        Human human = new Human("Valentin", 10);

        human.setTransport(new Car(100));
        human.move(100, TerrainType.FLATLAND);

        human.setTransport(new Horse(10));
        human.move(20, TerrainType.DEEP_FOREST);

        human.setTransport(new Rover(10));
        human.move(30, TerrainType.SWAMP);

        human.setTransport(new Bike(human));
        human.move(20, TerrainType.FLATLAND);

        human.setTransport(new Car(-100));
        human.move(100, TerrainType.FLATLAND);

        human.setTransport(new Horse(0));
        human.move(20, TerrainType.DEEP_FOREST);

        human.setTransport(new Rover(-100));
        human.move(30, TerrainType.SWAMP);

        human.setTransport(new Bike(human));
        human.move(-20, TerrainType.FLATLAND);
    }
}
