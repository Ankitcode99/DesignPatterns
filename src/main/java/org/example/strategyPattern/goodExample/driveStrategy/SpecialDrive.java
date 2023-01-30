package org.example.strategyPattern.goodExample.driveStrategy;

import org.example.strategyPattern.goodExample.driveStrategy.DriveMode;

public class SpecialDrive implements DriveMode {
    @Override
    public void drive() {
        System.out.println("SPECIAL DRIVE mode enabled");
    }
}
