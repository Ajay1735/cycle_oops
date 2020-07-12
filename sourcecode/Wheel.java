package cycleOops;

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

    public int tire(){
        return tire;
    }
    
    public int getDiameter() {
        return rim + (tire * 2);
    }
} 