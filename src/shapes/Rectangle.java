package src.shapes;

public class Rectangle {
    private int width;
    private int height;
    Rectangle(int x, int y){
        this.width = x;
        this.height = y;
    }

    public void area(){
        System.out.println(width*height);
    }

}

class Square extends Rectangle{

    Square(int side){
        super(side,side);
    }

}
