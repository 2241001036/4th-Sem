public class Driver {
    public static void main(String[] args) {
        Car C1 = new Car("Toyota", "Red", 200);
        Car C2 = new Car("Honda", "Blue", 180);
        if (C1.compareTo(C2) > 0)
        {
            System.out.println("Car 1 has greater speed:");
            C1.printDetails();
        }
        else if (C1.compareTo(C2) < 0)
        {
            System.out.println("Car 2 has greater speed:");
            C2.printDetails();
        }
        else
        {
            System.out.println("Both cars have the same speed.");
        }
    }
}
