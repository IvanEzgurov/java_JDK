package org.example.less5.homework5;

public class Philosopher extends Thread{
    private final String name;

    public Philosopher(String name) {
        this.name = name;
        this.start();
    }

    @Override
    public void run() {
        Thread.currentThread().setName(name);
        Dinner.dinner();
    }
}
