package com.training.design.patterns.chapter1.model;

public class RubberDuck extends Duck implements Quackable {

    @Override
    public void display() {
        System.out.println("I am a Rubber duck");
    }

    public void quack() {
        System.out.println("Squeak squeak");
    }
}
