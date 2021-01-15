package com.softwareguild.mvc.dal;

import com.softwareguild.mvc.controller.Settings;
import com.softwareguild.mvc.dal.file.TextDataSourceMapper;
import com.softwareguild.mvc.model.Product;
import com.softwareguild.mvc.view.Console;
import com.softwareguild.mvc.view.Display;
import com.softwareguild.mvc.view.IUserView;

import java.util.List;

public class DataStore {

    public enum DataSource {TEXT, MYSQL};
    private DataSource dataSource;

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

        DataStore dataStore = new DataStore(); // Create datastore object;
        dataStore.setDataSource(Settings.DATASOURCE); // Set its source type.
        IDataMapper dataMapper = dataSourceFactory(); // Initialize the datastore object after the correct type.
        List<Product> products = (List<Product>) dataMapper; // Have it retrieve the data.
        return products;
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    private IDataMapper dataSourceFactory(){
        IDataMapper dataMapper;
        switch(this.dataSource){
            case TEXT:
                 dataMapper = new TextDataSourceMapper();
                 return dataMapper;
            case MYSQL:
                IUserView display = Display.CreateDisplay(Settings.DISPLAY);
                display.Display("MySQL is not yet implemented.");
                break;
            default:
                break;
        }
        return null;
    }
}
