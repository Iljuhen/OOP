//Создать интерфейс, скорость плаванья
//Добавить новое животное, способное плавать
//Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

package DZs.dz2;

public class Turtle extends Animal implements Runable, Swimable{

    public Turtle(String name, int box, String color) {
        super(name, box, color);
       
    }

    @Override
    public String say() {
        
        return "OOO";
    }
    
    
    @Override
    public int speedOfRun() {
        
        return 5;

    }

    @Override
    public int speedOfSwim() {
        
        return 9;
    }
    
}
