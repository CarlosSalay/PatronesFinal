package services;

public class FlyLikeRocket implements FlyBehavior{

    public FlyLikeRocket() {
    }

    @Override
    public void fly() {
        System.out.println("El que tiene miedo a morir que me la chupe");
    }

    @Override
    public String toString() {
        return "FlyLikeRocket{}";
    }
}
