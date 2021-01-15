package com.softwareguild.mvc.controller;

import com.softwareguild.mvc.dal.DataStore;
import com.softwareguild.mvc.dal.IDataStore;
import com.softwareguild.mvc.view.Display;

public class Settings {
    public static Display.UX DISPLAY = Display.UX.GUI;
    public static String TEXT_DATA_SOURCE = "data.txt";
    public static DataStore.DataSource DATASOURCE = DataStore.DataSource.TEXT;
}
