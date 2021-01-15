package com.softwareguild.mvc.view;

/**
 * Manages the output to the console.
  */
public class Console implements IUserView {

    // Sends the message to the console.
    public void Display(String message) {
        System.out.println(message);
    }
}
