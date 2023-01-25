package sems.sem2;


// 1. Реализовать абстрактный класс Animal и его наследники Cat, Dog, и прочее. 
// Родитель имеет в себе общие данные (пример: кличка, количествор лап, какие звуки 
// издают и тд), а наследники собственные параметры (тип перемещения).
// 2. Создать класс Zoo, и организовать перекличку животных. 
// Теперь создать объект радио, и подумать, как его включить в объект Zoo.

public  abstract class Animal {

    private String name;
    private int box;

    public Animal(String name2, int box2) {
    }
    public String toString() {
        return String.format("Name is %s box num %d: ", this.name, this.box);
    }
    public abstract String say();
    
}
