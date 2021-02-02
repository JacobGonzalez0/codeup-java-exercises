package src.shapes;

public class Circle {

    private double radius;

    Circle(double r){
        this.radius = r;
    }
    
    public double getArea(){
        return  Math.PI * (radius*radius);
    }

    public double getCircumference(){
        return radius * Math.PI * 2;
    }
}
