package sems.sem4;

import java.util.Random;


import sems.sem4.Weapons.Weapon;

public class Bow extends Weapon {
    private int range;

    public Bow(int pointOfDamage, int range) {
        super(pointOfDamage);
        this.range = range;
    }

    @Override
    public String toString() {
        return "Bow [range=" + range + "]" + "Damage = " + pointOfDamage;
    }

    public int getRange() {
        return range;
    }

    @Override
    public int damage() {

        return new Random().nextInt(pointOfDamage);
    }

}
