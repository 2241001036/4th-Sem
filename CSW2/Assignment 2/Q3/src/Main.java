public class Main
{
    public static void main(String[] args)
    {
        Point point1 = new Point(3, 4);
        Point point2 = new Point(point1);
        point1.setX(5);
        point1.setY(6);
        System.out.println("Point1: (" + point1.getX() + ", " + point1.getY() + ")");
        System.out.println("Point2: (" + point2.getX() + ", " + point2.getY() + ")");
    }
}