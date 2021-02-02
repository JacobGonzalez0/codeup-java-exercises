package src.shapes;

import src.shapes.*;
import src.util.*;


public class CircleApp {

    private static Input iH;
    public static void main(String[] args) {
       iH = new Input();

       System.out.println("Whats the radius of your circle? ");
       int r = iH.getInt(0,Integer.MAX_VALUE);

       Circle ourC = new Circle(r);

       System.out.println("The Circumference of your circle is " + ourC.getCircumference());
       System.out.println("The Area of your circle is " + ourC.getArea());
    }
}
