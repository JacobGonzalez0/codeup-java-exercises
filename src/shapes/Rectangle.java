package src.shapes;

public class Rectangle extends Quadrilateral {

    Rectangle(double x, double y) {
        super(x, y);
        
    }

    public double getArea() {
        return (width*length);
    }

    public double getPerimeter(){
        return (2 * length + 2 * width);
    }

    @Override
    public void setWidth(double i) {
        width = i;
    }

    @Override
    public void setLength(double i) {
        length = i;
    }

}

