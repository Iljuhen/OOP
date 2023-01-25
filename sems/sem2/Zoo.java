package sems.sem2;

import java.util.ArrayList;

public class Zoo {
    
    private ArrayList<Animal> animals;
    
    public Zoo() {
        animals = new ArrayList<Animal>();
    }
    
    public Zoo addAnimal(Animal a) {
        animals.add(a);
        return this;
    }
    
    public ArrayList<Animal> getAnimals() {
        return animals;
    }
    
}
