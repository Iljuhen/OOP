package sems.sem4;

public class Archer extends Warrior{

    public Archer(String name, int healthPoint, Bow bow) {
        super(name, healthPoint, bow);
        
    }

    @Override
    public String toString() {
        return "Archer, " + super.toString();
    }
    
}
