public class Main {
    public static void main(String[] args)
    {
        Car myCar1 = new Car("Hyundai", "Verna");
        Car myCar2 = new Car(null,null);
        System.out.println("Initial make and model of Car1: " + myCar1.getMake() + " " + myCar1.getModel());
        System.out.println("Initial make and model of Car2: " + myCar2.getMake() + " " + myCar2.getModel());
        myCar2.setMake("Hyundai");
        myCar2.setModel("Creta");
        System.out.println("Initial make and model of Car1: " + myCar2.getMake() + " " + myCar2.getModel());
    }
}