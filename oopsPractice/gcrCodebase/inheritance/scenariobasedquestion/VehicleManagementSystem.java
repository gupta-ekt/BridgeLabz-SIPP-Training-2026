interface Refuelable {

    void refuel();
}

class Vehicle {

    protected String model;
    protected int maxSpeed;

    public Vehicle(String model, int maxSpeed) {

        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void display() {

        System.out.println("Model : " + model);
        System.out.println("Max Speed : " + maxSpeed);
    }
}

class ElectricVehicle extends Vehicle {

    public ElectricVehicle(String model, int maxSpeed) {

        super(model, maxSpeed);
    }

    public void charge() {

        System.out.println("Charging Electric Vehicle...");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(String model, int maxSpeed) {

        super(model, maxSpeed);
    }

    @Override
    public void refuel() {

        System.out.println("Refueling Petrol Vehicle...");
    }
}

public class VehicleManagementSystem {

    public static void main(String[] args) {

        ElectricVehicle ev =
                new ElectricVehicle("Tesla Model 3", 250);

        PetrolVehicle pv =
                new PetrolVehicle("Honda City", 180);

        System.out.println("Electric Vehicle");
        ev.display();
        ev.charge();

        System.out.println();

        System.out.println("Petrol Vehicle");
        pv.display();
        pv.refuel();
    }
}