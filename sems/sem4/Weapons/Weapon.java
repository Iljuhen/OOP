package sems.sem4.Weapons;

import sems.sem4.Weaponable;

public abstract class Weapon implements Weaponable {
    protected int pointOfDamage;
    public Weapon(int pointOfDamage){
        this.pointOfDamage = pointOfDamage;
    }
    
}
