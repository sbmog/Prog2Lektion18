package opgave03;

import opgave03.models.vehicles.*;

import java.util.ArrayList;
import java.util.List;

public class Opgave03 {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>(List.of(
                new RentableVehicle(new Car("Ford", "Mustang", CarType.SEDAN), 799.95),
                new RentableVehicle(new Car("Nissan", "Leaf", CarType.HATCHBACK), 499.95),
                new RentableVehicle(new Car("Volkswagen", "Golf", CarType.CABRIOLET), 599.95),
                new RentableVehicle(new Motorcycle("Harley-Davidson", "Street Bob", 700), 699.95),
                new RentableVehicle(new Motorcycle("Kawasaki", "Ninja", 1000), 649.95)
        ));

        RentableVehicle vehicleToRent = (RentableVehicle) vehicles.getFirst();

        vehicleToRent.rentOut();

        vehicles.forEach(System.out::println);
    }
}
