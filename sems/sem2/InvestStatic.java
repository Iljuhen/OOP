package sems.sem2;

public class InvestStatic {

    public static int maxId = 5;

    private int id;

    public InvestStatic(int id) {
        maxId++;
        this.id = maxId;
    }

    public int getId() {
        return id;
    }

    
    
}
