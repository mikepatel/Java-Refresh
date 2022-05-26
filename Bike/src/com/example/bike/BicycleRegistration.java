package com.example.bike;

public class BicycleRegistration {
    // main
    public static void main(String[] args) {
        // bike 1
        Bicycle bike1 = new Bicycle();
        bike1.setOwnerName("Michael");
        System.out.println(bike1.getOwnerName() + " owns a bike");

        // bike 2
        Bicycle bike2 = new Bicycle();
        bike2.setOwnerName("Patel");
        System.out.println(bike2.getOwnerName() + " also owns a bike");
    }
}
