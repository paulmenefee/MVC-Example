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
        // This will demo showing products from a text based
        // data source to the console implementing MVC.

        DataStore.DataSource sourceType = DataStore.DataSource.TEXT; // Normally you would add connection string properties
        DataStore dataStore = new DataStore();
        IUserView display = Display.CreateDisplay(Settings.DISPLAY);

        int i;
        for (Product p : dataStore.getProducts(Product.ProductCategory.CANDY) ) {
            display.Display(p.getName() + " - " + p.getPrice() + ", sale price: " + SaleController.ApplyDiscount(p, .10f).getPrice());
        }
    }
}
