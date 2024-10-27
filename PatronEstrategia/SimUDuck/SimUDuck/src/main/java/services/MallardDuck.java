package services;

public class MallardDuck extends Duck{

    public MallardDuck() {
        fb = new FlyWithWings();
        sb = new MakeQuack();
    }

    @Override
    public void display() {
        System.out.println("Soy un pato silvestre");
    }

    @Override
    public String toString() {
        return "MallardDuck{}";
    }

}
