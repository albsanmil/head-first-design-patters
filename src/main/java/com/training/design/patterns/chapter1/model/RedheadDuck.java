package com.training.design.patterns.chapter1.model;

public class RedheadDuck extends Duck implements Quackable, Flyable {

    @Override
    public void display() {
        System.out.println("I am a Red Head duck");
    }

    public void quack() {
        System.out.println("Quack quack");
    }

    public void fly() {
        System.out.println("I can fly");
    }
}
