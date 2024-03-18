public class Main {
    public static void main(String[] args)
    {
        Car C1 = new Car("Hyundai", "Verna");
        Car C2 = new Car(null,null);
        System.out.println("Initial make and model of Car1: " + C1.getMake() + " " + C1.getModel());
        System.out.println("Initial make and model of Car2: " + C2.getMake() + " " + C2.getModel());
        C2.setMake("Hyundai");
        C2.setModel("Creta");
        System.out.println("Initial make and model of Car1: " + C2.getMake() + " " + C2.getModel());
    }
}
