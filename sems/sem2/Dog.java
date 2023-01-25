package sems.sem2;

/* Класс Dog наследуется от Animal */
public class Dog extends Animal {
  
    public Dog(String name, int box) {
        super(name, box);
    }

    @Override
    public String say() {
        return "Гав";
    }

}
