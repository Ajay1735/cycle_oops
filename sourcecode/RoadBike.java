package cycleOops;

import cycleOops.Cycle;

/*
javac RoadBike.java -d classFiles
java -cp classFiles cycleOops.RoadBike
*/

public class RoadBike extends Cycle {
    private String tapeColor;
    
    public void RoadBike(Size sz, Gear gear, Wheel wheel, 
    String ch, double tiresize, String tapeColor) {
        Cycle(sz, gear, wheel, ch, tiresize);
        this.tapeColor = tapeColor;
    }

    public String getTapeColor() {
        return tapeColor;
    }

    public String toString() {
        return super.toString() + ", TapeColor: " + getTapeColor();
    }
}