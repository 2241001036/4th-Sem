public class Main
{
    public static void main(String[] args)
    {

        Circle circle = new Circle("yellow", 7);
        Rectangle rectangle = new Rectangle("red", 6, 7);
        Square square = new Square("blue", 5);
        circle.display();
        System.out.println("Area of circle: " + circle.area());

        rectangle.display();
        System.out.println("Area of rectangle: " + rectangle.area());

        square.display();
        System.out.println("Area of square: " + square.area());
    }
}