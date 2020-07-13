package cycleOops;

import java.java.lang.Math;

/*
javac Wheel.java -d classFiles
java -cp classFiles cycleOops.Wheel
*/

public class Wheel {

    private int rim;
    private int tire; 

    public void Wheel(int rim, int tire) {
        this.rim = rim;
        this.tire = tire;
    }

    public int getRim(){
        return rim;
    }

    public int getTire(){
        return tire;
    }

    public int getDiameter() {
        return getRim() + (getTire() * 2);
    }

    public double getCircumference() {
        return getDiameter()*Math.PI;
    }

    public String toString() {
		return "Rim: " + getRim() + ", Tire: " + getTire();
    }
    
} 