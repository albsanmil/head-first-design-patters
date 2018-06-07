package com.training.design.patterns.chapter1.puzzle.model;

import com.training.design.patterns.chapter1.puzzle.behavior.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weapon;

    public abstract void display();

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weaponBehavior) {
        this.weapon = weaponBehavior;
    }
}
