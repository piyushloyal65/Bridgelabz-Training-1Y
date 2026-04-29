package com.LogisticSystem;

class RouteLinkedList {

    class Node {
        Checkpoint data;
        Node next;

        Node(Checkpoint data) {
            this.data = data;
        }
    }

    Node head;

    public void addCheckpoint(Checkpoint c) {
        Node newNode = new Node(c);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public double computeTotalDistance() {
        double total = 0;
        Node temp = head;

        while (temp != null) {
            total += temp.data.distanceFromLast;
            temp = temp.next;
        }
        return total;
    }

    public double computeTotalPenalty() {
        double total = 0;
        Node temp = head;

        while (temp != null) {
            total += temp.data.calculatePenalty();
            temp = temp.next;
        }
        return total;
    }

    public void printRoute() {
        Node temp = head;
        int i = 1;

        while (temp != null) {
            Checkpoint c = temp.data;
            System.out.println(i + ". " + c.getType() + " - " + c.locationName +
                    " - " + (c.isDelayed() ? "Delayed" : "On Time") +
                    " - Penalty: " + c.calculatePenalty());
            temp = temp.next;
            i++;
        }
    }
}
