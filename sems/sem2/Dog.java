package sems.sem2;

/* Класс Dog наследуется от Animal */
public class Dog extends Animal implements Runable{
  
    public Dog(String name, int box, String color) {
        super(name, box, color);
    }

    @Override
    public String say() {
        return "Гав";
    }
    @Override
    public String toString() {
        return "Dog " + super.toString();
    }

    @Override
    public int speedOfRun() {
        return 40;
    }

    

}
