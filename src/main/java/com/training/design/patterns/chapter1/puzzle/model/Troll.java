package com.training.design.patterns.chapter1.puzzle.model;

import com.training.design.patterns.chapter1.puzzle.behavior.WeaponBehavior;

public class Troll extends Character {

    public Troll(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    @Override
    public void display() {
        System.out.println("I am a Troll");
    }

}
