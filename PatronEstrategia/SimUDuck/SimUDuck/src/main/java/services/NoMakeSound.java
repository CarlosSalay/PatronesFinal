package services;

public class NoMakeSound implements SoundBehavior{

    public NoMakeSound() {
    }

    @Override
    public void makeSound() {
        System.out.println("No hago sonido");
    }

    @Override
    public String toString() {
        return "NoMakeSound{}";
    }
}
