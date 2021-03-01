package src.shapes;

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
