package ru.gordeev.homeworks.homework5;

public class Dog extends Animal {

    public Dog(String name, double runSpeed, double swimSpeed, double stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    public double swim(int distance) {
        double timeForAction = distance / getSwimSpeed();

        setStamina(getStamina() - distance * 2);

        if (getStamina() <= 0) {
            timeForAction = -1;
            System.out.println(getName() + " не хватает выносливости, он устал(а)");
            return timeForAction;
        }

        System.out.println(getName() + " проплыл(а) " + distance + " метров со скоростью " + getSwimSpeed() + " м/c за " + timeForAction + " секунд");
        return timeForAction;
    }
}
