package com.softwareguild.mvc.dal;

import com.softwareguild.mvc.controller.ExceptionController;
import com.softwareguild.mvc.controller.Settings;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class TextDataSourceMapper implements IDataMapper {



    public void Create() {
        ExceptionController.log("CREATE is not implemented.");
    }

    public void Read() {
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(Settings.TEXT_DATA_SOURCE)));
        }
        catch (Exception ex){
            ExceptionController.log(ex.getMessage());
        }
    }

    public void Update() {
        ExceptionController.log("UPDATE is not implemented.");
    }

    public void Delete() {
        ExceptionController.log("DELETE is not implemented.");
    }
}
