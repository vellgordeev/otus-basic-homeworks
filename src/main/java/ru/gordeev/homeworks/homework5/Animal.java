package ru.gordeev.homeworks.homework5;

public abstract class Animal {

    protected String name;
    protected double runSpeed;
    protected double swimSpeed;
    protected double stamina;
    protected int costRatio;


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

    public Animal(String name, double runSpeed, double swimSpeed, double stamina, int costRatio) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
        this.costRatio = costRatio;
    }

    protected double run(int distance) {
        stamina -= distance;
        if (stamina <= 0) {
            System.out.println(name + " устал(а)");
            return -1;
        }

        double timeForRun = distance / runSpeed;
        System.out.println(name + " пробежал(а) " + distance + " метров" + " со скоростью " + runSpeed + " м/с"
                + " за " + timeForRun + " сек.");
        return timeForRun;
    }

    public double swim(int distance) {
        if (swimSpeed <= 0) {
            System.out.println("Животное не умеет плавать");
            return -1;
        }

        stamina -= distance * costRatio;
        if (stamina <= 0) {
            stamina = 0;
            System.out.println(name + " не хватает выносливости, он устал(а)");
            return -1;
        }

        double timeForSwim = distance / swimSpeed;
        System.out.println(name + " проплыл(а) " + distance + " метров со скоростью " + swimSpeed + " м/c за "
                + timeForSwim + " секунд");
        return timeForSwim;
    }

    protected void info() {
        System.out.println("Животное зовут " + name
                + ", его скорость бега - " + runSpeed
                + ", скорость плавания - " + swimSpeed
                + " и выносливость - " + stamina);
    }
}
