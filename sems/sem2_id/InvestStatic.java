package sems.sem2_id;

public class InvestStatic {
//* Создаем класс */



    public static int maxId = 0;

    private int id;


// Создаем конструктор
    public InvestStatic(int id) {
        maxId++;
        this.id = maxId;
    }
// Создаем геттер
    public int getId() {
        return id;
    }

    
    
}
