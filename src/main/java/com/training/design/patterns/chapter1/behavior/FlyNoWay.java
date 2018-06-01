package com.training.design.patterns.chapter1.behavior;

public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("I cannot fly");
    }
}
