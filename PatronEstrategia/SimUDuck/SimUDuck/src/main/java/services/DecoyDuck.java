package services;

public class DecoyDuck extends Duck{

    public DecoyDuck() {
    }

    @Override
    public void display() {
        System.out.println("Soy un pato senuelo");
    }

    @Override
    public String toString() {
        return "DecoyDuck{}";
    }
}
