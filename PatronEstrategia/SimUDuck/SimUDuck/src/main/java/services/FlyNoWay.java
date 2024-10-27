package services;

public class FlyNoWay implements FlyBehavior{

    public FlyNoWay() {
    }

    @Override
    public void fly() {
        System.out.println("No puedo volar");
    }

    @Override
    public String toString() {
        return "FlyNoWay{}";
    }
}
