package com.training.design.patterns.chapter1;

import com.training.design.patterns.chapter1.behavior.FlyNoWay;
import com.training.design.patterns.chapter1.behavior.Squeak;
import com.training.design.patterns.chapter1.model.*;

public class SimUDuck {

    static void performDuckActions(Duck duck) {
        duck.display();
        duck.performQuack();
        duck.swim();
        duck.performFly();
    }

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        performDuckActions(mallardDuck);

        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.setQuackBehavior(new Squeak());
        performDuckActions(mallardDuck);

        performDuckActions(new RedheadDuck());
        performDuckActions(new RubberDuck());
        performDuckActions(new DecoyDuck());
    }
}
