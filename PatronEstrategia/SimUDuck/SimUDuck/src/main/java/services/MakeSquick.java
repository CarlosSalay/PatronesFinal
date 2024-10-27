package services;

public class MakeSquick implements SoundBehavior{

    public MakeSquick() {
    }

    @Override
    public void makeSound() {
        System.out.println("Squick");
    }

    @Override
    public String toString() {
        return "MakeSquick{}";
    }
}
