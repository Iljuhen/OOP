package sems.sem2;

/* Класс Dog наследуется от Animal */
public class Dog extends Animal {

    private String color;

    public Dog(String name, int box, String color) {
        super(name, box);
        this.color = color;
    }

    @Override
    public String say() {
        return "Гав";
    }

}
