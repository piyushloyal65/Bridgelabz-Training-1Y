abstract class VehicleRide {
    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    public VehicleRide(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    abstract double calculateFare(double distance);
}

interface GPS {
    void updateLocation(String location);
}

class Bike extends VehicleRide implements GPS {
    public Bike(String id, String driver, double rate) {
        super(id, driver, rate);
    }

    double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    public void updateLocation(String location) {
        System.out.println(location);
    }
}