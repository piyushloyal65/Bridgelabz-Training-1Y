package com.LogisticSystem;

public class Main {
    public static void main(String[] args) {

        Driver d = new Driver("D1204", "Kavita Nair");

        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 30, 60, 70));
        d.routeHistory.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20, 30, 30));
        d.routeHistory.addCheckpoint(new RestCheckpoint("C3", "Motel X", 10, 20, 60));
        d.routeHistory.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 60, 80, 95));

        System.out.println("Driver: " + d.driverId + " - " + d.name);
        System.out.println("Route Summary:");

        d.routeHistory.printRoute();

        double totalDist = d.routeHistory.computeTotalDistance();
        double totalPenalty = d.routeHistory.computeTotalPenalty();

        System.out.println("Total Distance: " + totalDist);
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + (totalDist - totalPenalty));
    }
}
