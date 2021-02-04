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

class Square extends Quadrilateral{

    Square(int side){
        super(side,side);
    }

    @Override
    public double getArea(){
        return (width * 4);
    }

    @Override
    public double getPerimeter(){
        return (width * width);
    }

    @Override
    public void setWidth(double i) {
        width = i;
        length = i;
    }

    @Override
    public void setLength(double i) {
        width = i;
        length = i;
    }

}
