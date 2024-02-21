package com.training3;

public void diaplayCart(){
    System.out.println("cart summary:");
    for (product product:products){
        System.out.println("prodId:" + product.getProdId());
        System.out.println("prodName:" + product.getProdName());
        System.out.println("price:" + product.getPrice());
    }
    System.out.println("total price:" + getTotalPrice());

}
public static void main(String[] args) {
    product product1 = new product(1."rice",45);
    product product2 = new product(2."water",5);
    product product3 = new product(3."eggs",54);

    cart c = new cart();
    cart.addProduct(product1);
    cart.addProduct(product2);
    cart.addProduct(product3);

    cart.displayCart();








    }
}