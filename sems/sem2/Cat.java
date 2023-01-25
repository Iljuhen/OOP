package sems.sem2;

/* Класс Cat наследуется от Animal */
public class Cat extends Animal implements Runable {

        public Cat(String name, int box, String color) {
        super(name, box, color);
        
    }

    @Override
    public String say() {
        return "Мяу";
    }
    @Override
    public String toString() {
        return "Cat "+ super.toString();
    }

    @Override
    public int speedOfRun() {
        
        return 17;
    }
    

}
