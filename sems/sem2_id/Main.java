package sems.sem2_id;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("maxId = " + InvestStatic.maxId);
        InvestStatic obj1 = new InvestStatic(0);
        InvestStatic obj2 = new InvestStatic(0);
        System.out.println("id 1 object = " + obj1.getId());
        System.out.println("id 2 object = " + obj2.getId());
        InvestStatic a = null;
        System.out.println(a.getId());
    }

}
