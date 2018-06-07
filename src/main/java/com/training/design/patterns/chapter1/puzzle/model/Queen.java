package com.training.design.patterns.chapter1.puzzle.model;

import com.training.design.patterns.chapter1.puzzle.behavior.WeaponBehavior;

public class Queen extends Character {

    public Queen(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    @Override
    public void display() {
        System.out.println("I am a Queen");
    }
}
