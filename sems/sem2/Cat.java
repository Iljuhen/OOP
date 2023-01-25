package sems.sem2;

/* Класс Cat наследуется от Animal */
public class Cat extends Animal {

    private String color;

    public Cat(String name, int box, String color) {
        super(name, box);
        this.color = color;
    }

    @Override
    public String say() {
        return "Мяу";
    }

}
