abstract class Vehicle {

    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract double fuelCost(double km);
}

class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    @Override
    public double fuelCost(double km) {
        return km * 8;
    }
}

class Bus extends Vehicle {

    public Bus(String name) {
        super(name);
    }

    @Override
    public double fuelCost(double km) {
        return km * 20;
    }
}

class Bike extends Vehicle {

    public Bike(String name) {
        super(name);
    }

    @Override
    public double fuelCost(double km) {
        return km * 3;
    }
}

class ElectricCar extends Vehicle {

    public ElectricCar(String name) {
        super(name);
    }

    @Override
    public double fuelCost(double km) {
        return km * 2;
    }
}

public class TransportCompany {

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("Honda City"),
                new Bus("Volvo Bus"),
                new Bike("Royal Enfield"),
                new ElectricCar("Tesla")
        };

        double km = 100;

        for (Vehicle vehicle : fleet) {

            System.out.println(vehicle.name +
                    " Fuel Cost = ₹" + vehicle.fuelCost(km));

            if (vehicle instanceof Car)
                System.out.println("This is a Car.");

            else if (vehicle instanceof Bus)
                System.out.println("This is a Bus.");

            else if (vehicle instanceof Bike)
                System.out.println("This is a Bike.");

            else if (vehicle instanceof ElectricCar)
                System.out.println("This is an Electric Car.");

            System.out.println();
        }
    }
}