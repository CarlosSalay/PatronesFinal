package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class ConcreteSubject extends Observable {
    private List<Observer> observers = new ArrayList<>();
    private String state;
    @Override
    public synchronized void addObserver(Observer o) {
        observers.add(o);
    }
    @Override
    public synchronized void deleteObserver(Observer o) {
        observers.remove(o);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this, null);          }
    }
    public void setState(String state) {
        this.state = state;
        setChanged();
        notifyObservers();
    }
    public String getState() {
        return state;}

    @Override
    public String toString() {
        return "ConcreteSubject: " + state;
    }

    public void registerObserver(ConcreteObserver observer1) {
    }
}
