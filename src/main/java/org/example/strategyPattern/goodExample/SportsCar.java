package org.example.strategyPattern.goodExample;

import org.example.strategyPattern.goodExample.driveStrategy.SpecialDrive;

public class SportsCar extends Vehicle{
    public SportsCar(){
        super(new SpecialDrive());
    }
}
