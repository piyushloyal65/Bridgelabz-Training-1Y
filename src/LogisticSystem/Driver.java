package com.LogisticSystem;

class Driver {
    String driverId;
    String name;
    RouteLinkedList routeHistory;

    public Driver(String id, String name) {
        this.driverId = id;
        this.name = name;
        this.routeHistory = new RouteLinkedList();
    }
}
