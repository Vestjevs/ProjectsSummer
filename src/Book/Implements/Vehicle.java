package Book.Implements;

import Book.Implements.Book;
import Book.Interfaces.IVehicle;

public class Vehicle implements IVehicle {
    private int passengers;
    private int fuel;
    private int mpg;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuel = f;
        mpg = m;
    }

    public int range() {
        return mpg * fuel;
    }

    @Override
    public double fuelneeded(int miles) {
        return (double) miles / mpg;
    }


    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int p) {
        passengers = p;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int f) {
        fuel = f;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int m) {
        mpg = m;
    }

}
