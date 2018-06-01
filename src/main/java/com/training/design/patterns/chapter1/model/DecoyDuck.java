package com.training.design.patterns.chapter1.model;

import com.training.design.patterns.chapter1.behavior.FlyNoWay;
import com.training.design.patterns.chapter1.behavior.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I am a Decoy duck");
    }
}
