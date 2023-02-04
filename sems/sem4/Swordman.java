package sems.sem4;

import sems.sem4.Weapons.Sword;

public class Swordman extends Warrior {

    public Swordman(String name, int healthPoint, Weaponable weapon){

        super(name, healthPoint, weapon);
    }
    @Override
    public String toString() {
        
        return "Swordman, " + super.toString();
    }
}
    