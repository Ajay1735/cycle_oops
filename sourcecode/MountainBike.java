package cycleOops;

import cycleOops.Cycle;

/*
javac MountainBike.java -d classFiles
java -cp classFiles cycleOops.MountainBike
*/

public class MountainBike extends Cycle {
    private String frontShock;
    private String rearShock;

    public void MountainBike(Size sz, Gear gear, Wheel wheel, String ch, 
    double tiresize, String frontShock, String rearShock) {
        Cycle(sz, gear, wheel, ch, tiresize);
        this.frontShock = frontShock;
        this.rearShock = rearShock;
    }

    public String getFrontshock() {
        return frontShock;
    }

    public String getRearshock() {
        return rearShock;
    }

    public String toString() {
        return super.toString() + ", FrontShock: " + getFrontshock() + ", RearSock: " + getRearshock();
    }
}