package org.example;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {
    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject) {
        this.subject = subject;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof ConcreteSubject) {
            // Actualización cuando el estado del sujeto cambia.
            System.out.println("Estado actualizado a: " + subject.getState());
        }
    }

    @Override
    public String toString() {
        return "ConcreteObserver observando: " + subject.getState();
    }
}
