package com.softwareguild.mvc;


import com.softwareguild.mvc.controller.SaleController;
import com.softwareguild.mvc.controller.Settings;
import com.softwareguild.mvc.dal.DataStore;
import com.softwareguild.mvc.dal.IDataStore;
import com.softwareguild.mvc.model.Product;
import com.softwareguild.mvc.view.Display;
import com.softwareguild.mvc.view.IUserView;

public class Main {
    public static void main(String[] args) {
        // This demo will show products from a text based
        // data source to the console implementing MVC.

        // Two different ways of setting the same type of attribute.
        DataStore dataStore = new DataStore();
        dataStore.setDataSource(Settings.DATASOURCE); // Method 1: Setting the attribute in it's own method after the object has been initialized.
        IUserView display = Display.CreateDisplay(Settings.DISPLAY); // Method 2: Setting the attribute in the constructor during initialization.

        // List all of the products in the product catalog.
        int i;
        for (Product p : dataStore.getProducts(Product.ProductCategory.FOOD) ) {
            display.Display(p.getName() + " - " + p.getPrice() + ", sale price: " + SaleController.ApplyDiscount(p, .10f).getPrice());
        }
    }
}
