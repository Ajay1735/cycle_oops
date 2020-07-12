package cycleOops;

import cycleOops.Gear;
import cycleOops.Wheel;

/*
javac Cycle.java -d classFiles
java -cp classFiles cycleOops.Cycle
*/

public class Cycle {
    private Gear gear;
    private Wheel wheel;

    public Cycle(Gear gear, Wheel wheel) {
        this.gear = gear;
        this.wheel = wheel;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public Gear getGear() {
        return gear;
    }

    public double getGearInches() {
        return getWheel().getDiameter() * getGear().getRatio();
    }
    
}