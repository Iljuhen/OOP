package sems.java_oop_main.src;

public class SuperBaton extends Baton {
    private TypeSize size;

    public SuperBaton(String name, double cost, double calories, TypeSize size) {
        super(name, cost, calories);
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " " + size;
    }
}