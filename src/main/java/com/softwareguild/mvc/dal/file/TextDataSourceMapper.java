package com.softwareguild.mvc.dal.file;

import com.opencsv.CSVReader;
import com.softwareguild.mvc.controller.ExceptionController;
import com.softwareguild.mvc.controller.Settings;
import com.softwareguild.mvc.dal.IDataMapper;
import com.softwareguild.mvc.model.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextDataSourceMapper implements IDataMapper {

    public void Create() {
        ExceptionController.log("CREATE is not implemented.");
    }


    public List<Object> Read(Object dataObject) {
        List<Object> list = new ArrayList<Object>();
        try {
            CSVReader reader = new CSVReader(new FileReader(Settings.TEXT_DATA_SOURCE));
            switch(dataObject.getClass().getName()) {
                case "Product":
                    String[] lineInArray;
                    while ((lineInArray = reader.readNext()) != null) {
                        Product product = new Product(Integer.parseInt(lineInArray[0]),lineInArray[1],Float.parseFloat(lineInArray[2]), com.softwareguild.mvc.model.Product.ProductCategory.valueOf(lineInArray[3]));
                        list.add(product);
                    }
                    break;
                case"Customer":
                    break;
                case "Cart":
            }
        }
        catch (Exception ex){
            ExceptionController.log(ex.getMessage());
        }
        return null;
    }

    public void Update() {
        ExceptionController.log("UPDATE is not implemented.");
    }

    public void Delete() {
        ExceptionController.log("DELETE is not implemented.");
    }
}
