package sems.sem1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class VandingMachine {
    private List <Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    public VandingMachine(List<Product> products) {
        this.products = products;
    }

    public VandingMachine(){

    }

    public VandingMachine(Product product){
        this(new ArrayList<>(Arrays.asList(product)));
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public Product find(String name) {
        for (Product product : products) {
            if (product.getName().contains(name)) {
                return product;
                
            }
            
        }
        return null;
    }
    
}
