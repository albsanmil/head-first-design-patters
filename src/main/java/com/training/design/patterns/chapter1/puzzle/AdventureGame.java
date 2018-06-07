package com.training.design.patterns.chapter1.puzzle;

import com.training.design.patterns.chapter1.puzzle.behavior.AxeBehavior;
import com.training.design.patterns.chapter1.puzzle.behavior.BowAndArrowBehavior;
import com.training.design.patterns.chapter1.puzzle.behavior.KnifeBehavior;
import com.training.design.patterns.chapter1.puzzle.behavior.SwordBehavior;
import com.training.design.patterns.chapter1.puzzle.model.Character;
import com.training.design.patterns.chapter1.puzzle.model.*;


public class AdventureGame {

    static void performFightAction(Character character) {
        character.display();
        character.fight();
    }

    public static void main(String[] args) {
        Character king = new King(new AxeBehavior());
        performFightAction(king);
        king.setWeapon(new BowAndArrowBehavior());
        performFightAction(king);

        Character queen = new Queen(new BowAndArrowBehavior());
        performFightAction(queen);

        Character knight = new Knight(new SwordBehavior());
        performFightAction(knight);

        Character troll = new Troll(new KnifeBehavior());
        performFightAction(troll);

        Character king2 = new King(new SwordBehavior());
        performFightAction(king2);

        Character queen2 = new Queen(new AxeBehavior());
        performFightAction(queen2);

        Character knight2 = new Knight(new AxeBehavior());
        performFightAction(knight2);

        Character troll2 = new Troll(new SwordBehavior());
        performFightAction(troll2);
    }
}
