package org.example.strategyPattern.goodExample;


import org.example.strategyPattern.goodExample.driveStrategy.SpecialDrive;

public class ATV extends Vehicle{

    public ATV() {
        super(new SpecialDrive());
    }
}
