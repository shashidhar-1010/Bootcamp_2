package com.training3;
import java.util.ArrayList;
import java.util.List;

public class cart {
    private List<product> products;
    public cart(){
        products = new ArrayList<product>();
    }

    public void addProduct(product product ){
        products.add(product);
    }
    public double getTotalPrice(){
        double total = 0;
        for(product product:products){
            total += product.getPrice();
        }
        return total;
    }
}
