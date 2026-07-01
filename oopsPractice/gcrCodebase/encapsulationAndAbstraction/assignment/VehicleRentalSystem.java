abstract class Vehicle {

    private String vehicleNumber;
    private String vehicleType;

    public Vehicle(String vehicleNumber, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
    }

    // Getters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    // Setters
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    // Abstract Method
    public abstract double calculateRentalCost(int days);

    // Concrete Method
    public void displayVehicleInfo() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
    }
}

// Car Class
class Car extends Vehicle {

    private double dailyRate;

    public Car(String vehicleNumber, double dailyRate) {
        super(vehicleNumber, "Car");
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

// Bike Class
class Bike extends Vehicle {

    private double dailyRate;

    public Bike(String vehicleNumber, double dailyRate) {
        super(vehicleNumber, "Bike");
        this.dailyRate = dailyRate;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * dailyRate;
    }
}

// Truck Class
class Truck extends Vehicle {

    private double dailyRate;
    private double loadingCharge;

    public Truck(String vehicleNumber, double dailyRate, double loadingCharge) {
        super(vehicleNumber, "Truck");
        this.dailyRate = dailyRate;
        this.loadingCharge = loadingCharge;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public double getLoadingCharge() {
        return loadingCharge;
    }

    public void setLoadingCharge(double loadingCharge) {
        this.loadingCharge = loadingCharge;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (days * dailyRate) + loadingCharge;
    }
}

// Main Class
public class VehicleRentalSystem {

    public static void main(String[] args) {

        int days = 5;

        Car car = new Car("CAR101", 1500);
        Bike bike = new Bike("BIKE201", 500);
        Truck truck = new Truck("TRUCK301", 3000, 2000);

        System.out.println("===== Car Details =====");
        car.displayVehicleInfo();
        System.out.println("Rental Cost for " + days + " days = ₹" + car.calculateRentalCost(days));

        System.out.println();

        System.out.println("===== Bike Details =====");
        bike.displayVehicleInfo();
        System.out.println("Rental Cost for " + days + " days = ₹" + bike.calculateRentalCost(days));

        System.out.println();

        System.out.println("===== Truck Details =====");
        truck.displayVehicleInfo();
        System.out.println("Rental Cost for " + days + " days = ₹" + truck.calculateRentalCost(days));
    }
}