package sems.sem2;

public class Duck extends Animal implements Runable, Flyable{

    public Duck(String name, int box, String color) {
        super(name, box, color);
       
    }

    @Override
    public String say() {
        
        return "Кря-кря";
    }
    @Override
    public int speedOfFly() {
        
        return 30;
    }
    @Override
    public int speedOfRun() {
        
        return 10;
    }
    
}
