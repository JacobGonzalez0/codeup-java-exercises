package src.shapes;

public class ShapesTest {
    public static void main(String[] args) {
        // Rectangle box1 = new Rectangle(4,5);
        // System.out.println("The area of your first rectangle is: " + box1.getArea());
        // System.out.println("The Perimeter of your first rectangle is: " + box1.getPerimeter());

        // Rectangle box2 = new Square(5);
        // System.out.println("The area of your second rectangle is: " + box2.getArea());
        // System.out.println("The Perimeter of your second rectangle is: " + box2.getPerimeter());

        Measurable myShape = new Rectangle(4,5);
        
        System.out.println("The area of your first rectangle is: " + myShape.getArea());
        System.out.println("The Perimeter of your first rectangle is: " + myShape.getPerimeter());

        myShape = new Square(5);
        
        System.out.println("The area of your second rectangle is: " + myShape.getArea());
        System.out.println("The Perimeter of your second rectangle is: " + myShape.getPerimeter());
    }
}
