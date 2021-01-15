package com.softwareguild.mvc.controller;

import com.softwareguild.mvc.view.Display;
import com.softwareguild.mvc.view.IUserView;

public class ExceptionController {
    public static void log(Exception exception){
        IUserView ux = Display.CreateDisplay(Settings.DISPLAY);
        ux.Display(exception.getMessage());
    }

    public static void log(String message){
        IUserView ux = Display.CreateDisplay(Settings.DISPLAY);
        ux.Display(message);
    }
}
