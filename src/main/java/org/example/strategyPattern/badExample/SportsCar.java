package org.example.strategyPattern.badExample;

public class SportsCar extends Vehicle{
    @Override
    public void drive() {
        System.out.println("This car has SPECIAL DRIVE mode");
    }
}
