import java.util.ArrayList;

public class Ferry {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(
          new Truck(
          3,
          false,
          6,
          "12/04/2001",
          "roat",
          1300,
          6
          )
        );

        vehicles.add(
            new Motorcycle(
                1,
                false,
                2,
                "1/07/1999",
                "roat",
                300
            )
        );

        vehicles.add(
            new Car(
                5,
                false,
                6,
                "25/02/1870",
                "roat",
                4
            )
        );

        vehicles.add(
            new Boat(
                15,
                true,
                0,
                "12/04/2001",
                "water",
                200,
                true
            )
        );

        vehicles.add(
            new Bicycle(
                15,
                true,
                0,
                "12/04/2001",
                "water",
                15,
                true
            )
        );

        vehicles.forEach(vehicle -> System.out.println(vehicle.toString()));
    }
}
