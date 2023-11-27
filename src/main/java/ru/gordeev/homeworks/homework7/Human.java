package ru.gordeev.homeworks.homework7;

public class Human {

    private String name;
    private int stamina;
    private Movable transport;


    public Human(String name, int stamina) {
        this.name = name;
        this.stamina = stamina;
    }

    public Movable getTransport() {
        return transport;
    }

    public void setTransport(Movable transport) {
        this.transport = transport;

    }

    public String getName() {
        return name;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public void move(int distance, TerrainType terrainType) {
        if (distance <= 0) {
            System.out.println("Дистанция должна быть положительным числом");
            return;
        }

        if (transport == null) {
            if (stamina <= 0) {
                System.out.println("Не могу никуда идти, устал!");
            }

            int tempStamina = stamina - distance / 10;
            if (tempStamina <= 0) {
                stamina = 0;
                System.out.println("Устал, нужно сделать привал! Прошел пешком, расстояние: " + distance + " км. " +
                        "Тип местности: " + terrainType.getType());
                return;
            }

            stamina -= distance / 10;
            System.out.println("Прошел пешком, расстояние: " + distance + " км. Тип местности: " + terrainType.getType());
            return;
        }

        transport.move(terrainType, distance);
    }

}
