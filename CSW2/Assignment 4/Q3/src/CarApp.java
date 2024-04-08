import java.util.ArrayList;
import java.util.Collections;
public class CarApp
{
    public static void main(String[] args)
    {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(2017, "Audi", 45));
        cars.add(new Car(2013, "Creta", 10));
        cars.add(new Car(2018, "Kia", 20));
        cars.add(new Car(2020, "MG", 13));
        cars.add(new Car(2015, "BMW", 55));
        Collections.sort(cars);
        System.out.println("List of sorted Car Objects:");
        for (Car car : cars)
        {
            System.out.println(car);
        }
    }
}
