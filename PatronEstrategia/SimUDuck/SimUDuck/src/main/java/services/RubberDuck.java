package services;

public class RubberDuck extends Duck{

    public RubberDuck() {
    }

    @Override
    public void display() {
        System.out.println("Soy un pato de goma");
    }

    @Override
    public String toString() {
        return "RubberDuck{}";
    }
}
