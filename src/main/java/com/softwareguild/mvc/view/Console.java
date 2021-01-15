package com.softwareguild.mvc.view;

public class Console implements IUserView {

    public void Display(String message) {
        System.out.println(message);
    }
}
