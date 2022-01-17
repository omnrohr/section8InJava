package com.company.section9.innerclasses;

public class Main {
    public static void main(String[] args) {
        GearBox BMW = new GearBox(6);
        GearBox.Gear first = BMW.new Gear(1, 12.3);
        GearBox.Gear second = BMW.new Gear(2,10.5);
        first.driveSpeed(10);
    }
}
