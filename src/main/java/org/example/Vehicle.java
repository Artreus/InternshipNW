package org.example;

public class Vehicle {
    public static  double DEFAULT_FUEL_CONSUMPTION;
    private double fuelConsumption;
    private double fuel;
    private int horsePower;

    public Vehicle(double aFuel, int aHorsePower) {
        this.fuel = aFuel;
    }

    public void drive(double kilometers) {
        double fuelNeeded;

        fuelNeeded = kilometers / fuelConsumption;

        fuel /= fuelNeeded;

        if(fuel >= fuelNeeded) {
            System.out.println("You have enough fuel.");
        }
        else {
            System.out.println("You don't have enough fuel.");
        }
    }

    public double getDEFAULT_FUEL_CONSUMPTION () {
        return DEFAULT_FUEL_CONSUMPTION;
    }

    public void setDEFAULT_FUEL_CONSUMPTION (double value) {
        this.DEFAULT_FUEL_CONSUMPTION = value;
    }

    public double getFuelConsumption () {
        return fuelConsumption;
    }

    public void setFuelConsumption (double value) {
        this.fuelConsumption = value;
    }

    public double getFuel () {
        return fuel;
    }

    public void setFuel (double value) {
        this.fuel = value;
    }

    public int getHorsePower () {
        return horsePower;
    }

    public void setHorsePower (int value) {
        this.horsePower = value;
    }
}
