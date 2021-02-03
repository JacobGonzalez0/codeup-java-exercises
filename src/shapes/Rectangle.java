package src.shapes;

public class Rectangle {
    protected int width;
    protected int height;
    Rectangle(int x, int y){
        this.width = x;
        this.height = y;
    }

    public int getArea(){
        return (width*height);
    }

    public int getPerimeter(){
        return (2 * height + 2 * width);
    }

}

class Square extends Rectangle{

    Square(int side){
        super(side,side);
    }

    @Override
    public int getArea(){
        return (width * 4);
    }

    @Override
    public int getPerimeter(){
        return (width * width);
    }

}
