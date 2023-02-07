package sems.sem1;

public class sem1 {
    public static void main(String[] args) {
        VandingMachine vending1 = new VandingMachine(new Product(10, "chokolate"));
        vending1.addProduct(new Product(20, "bread"));
        vending1.addProduct(new Raviolli(30, "ot Palicha", 45));
        for(Product item: vending1.getProducts()){
        
        System.out.println(item);
    }
    Product find = vending1.find("Palicha");
    System.out.println(find);
}
}
