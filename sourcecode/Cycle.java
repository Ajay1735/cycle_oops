package cycleOops;

import cycleOops.Gear;
import cycleOops.Wheel;

/*
javac Cycle.java -d classFiles
java -cp classFiles cycleOops.Cycle
*/

public class Cycle {
    private Size sz;
    private Gear gear;
    private Wheel wheel;
    private String ch;
    private double tiresize;

    public Cycle(Size sz, Gear gear, Wheel wheel, String ch, double tiresize) {
        this.sz = sz;
        this.gear = gear;
        this.wheel = wheel;
        this.ch = ch;
        this.tiresize = tiresize;
    }

    public Size getSize() {
        return sz;
    }

    public Gear getGear() {
        return gear;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public String getChain() {
        return ch;
    }

    public double getTiresize() {
        return tiresize;
    }

    public double getGearInches() {
        return getWheel().getDiameter() * getGear().getRatio();
    }

    public String toString() {
        return "Size: " + getSize() + ", Gear: " + getGear() + ", Wheel: " + getWheel() +
                ", Chain: " + getChain() + ", Tiresize: " + getTiresize(); 
    }

}