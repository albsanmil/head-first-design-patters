package com.training.design.patterns.chapter1;

import com.training.design.patterns.chapter1.model.*;

public class SimUDuck {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedheadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();

        mallardDuck.display();
        ((MallardDuck) mallardDuck).quack();
        mallardDuck.swim();
        ((MallardDuck) mallardDuck).fly();

        redheadDuck.display();
        ((RedheadDuck) redheadDuck).quack();
        redheadDuck.swim();
        ((RedheadDuck) redheadDuck).fly();

        rubberDuck.display();
        ((RubberDuck) rubberDuck).quack();
        rubberDuck.swim();

        decoyDuck.display();
        decoyDuck.swim();
    }
}
