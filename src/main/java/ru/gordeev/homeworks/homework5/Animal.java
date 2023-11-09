package ru.gordeev.homeworks.homework5;

public abstract class Animal {

    private String name;
    private double runSpeed;
    private double swimSpeed;
    private double stamina;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        double timeForAction = distance / runSpeed;

        stamina -= distance;
        if (stamina <= 0) {
            timeForAction = -1;
            System.out.println(name + " устал(а)");
            return timeForAction;
        }

        System.out.println(name + " пробежал(а) " + distance + " метров" + " со скоростью " + runSpeed + " м/с"
                + " за " + timeForAction + " сек.");
        return timeForAction;
    }

    protected void info() {
        System.out.println("Животное зовут " + name
                + ", его скорость бега - " + runSpeed
                + ", скорость плавания - " + swimSpeed
                + " и выносливость - " + stamina);
    }
}
