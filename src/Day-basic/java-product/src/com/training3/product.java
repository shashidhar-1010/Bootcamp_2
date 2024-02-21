package com.training3;

public class product {
    private int prodId;
    private String prodName;
    private double price;

    public product (int prodId, String prodName, double price){
        this.prodId=prodId;
        this.prodName=prodName;
        this.price=price;

    }

    public int getProdId(){
        return prodId;
    }
    public String getProdName(){
        return prodName;
    }
    public double getPrice(){
        return price;
    }
}
