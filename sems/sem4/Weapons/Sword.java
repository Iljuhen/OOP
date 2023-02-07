package sems.sem4.Weapons;

import java.util.Random;

public class Sword extends Weapon {
    public int nextInt(int min, int max) {
        return 0;

    }

    public Sword(int pointOfDamage) {
        super(pointOfDamage);

    }

    @Override
    public String toString() {

        return String.format("Sword damage = %d", pointOfDamage);
    }

    @Override
    public int damage() {
        int min = 0;
        int max = pointOfDamage;
        int my_rnd = new Random().nextInt(0, pointOfDamage);

        return my_rnd;
    }

}
