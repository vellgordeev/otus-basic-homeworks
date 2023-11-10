package ru.gordeev.homeworks.homework5;

public abstract class Animal {

    private String name;
    private double runSpeed;
    private double swimSpeed;
    private double stamina;


    public String getName() {
        return name;
    }

    public double getRunSpeed() {
        return runSpeed;
    }

    public double getSwimSpeed() {
        return swimSpeed;
    }

    public double getStamina() {
        return stamina;
    }

    public void setStamina(double stamina) {
        this.stamina = stamina;
    }

    public Animal(String name, double runSpeed, double swimSpeed, double stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
    }

    protected double run(int distance) {
        double timeForRun = distance / runSpeed;

        stamina -= distance;
        if (stamina <= 0) {
            timeForRun = -1;
            System.out.println(name + " устал(а)");
            return timeForRun;
        }

        System.out.println(name + " пробежал(а) " + distance + " метров" + " со скоростью " + runSpeed + " м/с"
                + " за " + timeForRun + " сек.");
        return timeForRun;
    }

    public double swim(int distance) {
        if (swimSpeed <= 0) {
            System.out.println("Животное не умеет плавать");
            return -1;
        }

        double timeForSwim = distance / swimSpeed;
        if (this instanceof Dog) {
            stamina -= distance * 2;
        } else if (this instanceof Horse) {
            stamina -= distance * 4;
        }

        if (stamina <= 0) {
            timeForSwim = -1;
            System.out.println(name + " не хватает выносливости, он устал(а)");
            return timeForSwim;
        }

        System.out.println(name + " проплыл(а) " + distance + " метров со скоростью " + swimSpeed + " м/c за " + timeForSwim + " секунд");
        return timeForSwim;
    }

    protected void info() {
        System.out.println("Животное зовут " + name
                + ", его скорость бега - " + runSpeed
                + ", скорость плавания - " + swimSpeed
                + " и выносливость - " + stamina);
    }
}
