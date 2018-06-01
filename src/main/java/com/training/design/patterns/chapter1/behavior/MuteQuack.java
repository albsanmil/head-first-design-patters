package com.training.design.patterns.chapter1.behavior;

public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("<< Silence >>");
    }
}
