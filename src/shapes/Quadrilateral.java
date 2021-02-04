package src.shapes;

public abstract class Quadrilateral implements Measurable {
    protected double width;
    protected double length;

    Quadrilateral(double x, double y){
        this.width = x;
        this.length = y;
    }

    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    abstract public void setWidth(double i);
    abstract public void setLength(double i);
}


