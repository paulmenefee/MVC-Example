package com.softwareguild.mvc.controller;

import com.softwareguild.mvc.model.Product;

public class SaleController {
    public static Product ApplyDiscount(Product product, float discount){
        Product discountedProduct = new Product(product);
        discountedProduct.setPrice(product.getPrice()/discount); // Example bug fix.
        return discountedProduct;
    }
}
