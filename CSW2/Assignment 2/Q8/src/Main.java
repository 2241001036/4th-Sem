public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        car.accelerate();
        car.brake();
        System.out.println();
        bicycle.accelerate();
        bicycle.brake();
        System.out.println();
        car.accelerate(30);
        car.accelerate(60, 5);
        System.out.println();
        bicycle.accelerate(10);
        bicycle.accelerate(20, 3);
    }
}