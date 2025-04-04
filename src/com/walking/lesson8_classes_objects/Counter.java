package com.walking.lesson8_classes_objects;

public class Counter {
    public String name;
    public int counter;

    public Counter(String name, int counter) {
        this.name = name;
        this.counter = counter;
    }

    public Counter(String name) {
        this(name, 0);
    }

    public int increaseCounter(int value) {
        counter += value;
        return counter;
    }

    public int decreaseCounter(int value) {
        counter -= value;
        return counter;
    }

    public int incrementCounter() {
        return counter++;
    }

    public int decrementCounter() {
        return counter--;
    }
}


