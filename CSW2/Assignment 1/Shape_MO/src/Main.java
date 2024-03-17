public class Main {
    public static void main(String[] args) {

        Shape circle = new Circle("red", 5);
        circle.display();
        circle.display();
        Shape rectangle = new Rectangle("blue", 4, 6);
        rectangle.display();
        rectangle.display();
        rectangle.display();
        Shape square = new Square("green", 3);
        square.display();
        square.display();
    }
}
