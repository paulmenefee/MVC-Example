package com.softwareguild.mvc.dal;

import com.softwareguild.mvc.model.Product;
import com.softwareguild.mvc.view.Console;

import java.util.ArrayList;
import java.util.List;

public class DataStore {
    public enum DataSource {TEXT, MYSQL};

    public static IDataMapper CreateDataStore(DataSource dataSource){
        switch(dataSource){
            case TEXT:
                return new TextDataSourceMapper();
            case MYSQL:
                Console c = new Console();
                c.Display("MySQL is not yet implemented.");
                return null;
            default:
                break;
        }
        return null;
    }

    // This datastore would normally connect to a database.
    public List<Product> getProducts(Product.ProductCategory productCategory) {

        List<Product> products = new ArrayList<Product>();

        return products;
    }
}
