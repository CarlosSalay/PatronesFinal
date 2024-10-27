package services;

public class RedHeadDuck extends Duck{

    public RedHeadDuck() {
    }

    @Override
    public void display() {
        System.out.println("Soy un pato de cabeza roja");
    }

    @Override
    public String toString() {
        return "RedHeadDuck{}";
    }
}
