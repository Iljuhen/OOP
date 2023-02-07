package DZs.dz2;


// 1. Реализовать абстрактный класс Animal и его наследники Cat, Dog, и прочее. 
// Родитель имеет в себе общие данные (пример: кличка, количествор лап, какие звуки 
// издают и тд), а наследники собственные параметры (тип перемещения).
// 2. Создать класс Zoo, и организовать перекличку животных. 
// Теперь создать объект радио, и подумать, как его включить в объект Zoo.

public  abstract class Animal implements Speakabll{

    private String name;
    private int box;
    private String color;

    public Animal(String name, int box, String color) {
        this.name = name;
        this.box = box;
        this.color = color;
    }
    @Override
    public String toString() {
        return String.format("Name is %s box num : %d color is %s" , this.name, this.box,this.color);
    }
    public abstract String say();
    
}
