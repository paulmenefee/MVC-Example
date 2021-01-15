package com.softwareguild.mvc.view;


public class Display {

    public enum UX {CONSOLE, GUI, API};
    private UX ux;

    // Produces a display object of type specified.
    // This is an example of an OBJECT FACTORY which can be
    // refactored to be it's own class.
    public static IUserView CreateDisplay(UX ux){
        switch(ux){
            case API:
                Console api = new Console();
                api.Display("API display is not implemented.");
                return null;
            case CONSOLE:
                Console c = new Console();
                c.Display("Switching to console mode.");
                return c;
            case GUI:
                Console gui = new Console();
                gui.Display("GUI display is not implemented.");
                return null;
            default:
                break;
        }
        return null;
    }
}
