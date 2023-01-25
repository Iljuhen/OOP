package sems.sem2;

/* Класс Cat наследуется от Animal */
public class Cat extends Animal {

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
    

}
