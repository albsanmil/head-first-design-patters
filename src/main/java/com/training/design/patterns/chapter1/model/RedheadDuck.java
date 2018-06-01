package com.training.design.patterns.chapter1.model;

import com.training.design.patterns.chapter1.behavior.FlyWithWings;
import com.training.design.patterns.chapter1.behavior.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I am a Red Head duck");
    }
}
