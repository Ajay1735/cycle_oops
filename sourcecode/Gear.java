package cycleOops;

/*
javac Gear.java -d classFiles
java -cp classFiles cycleOops.Gear
*/

public class Gear {

    private int chainring;
    private int cog;
    // private int rim;
    // private int tire;

    public void Gear(int chainring, int cog) { //, int rim, int tire){
        this.chainring = chainring;
        this.cog = cog;
        // this.rim = rim;
        // this.tire = tire;
    }
    
    public int getChainRing(){
        return chainring;
    }

    public int getCog(){
        return cog;
    }

    public double getRatio() {
        return getChainRing() * 1.0/ getCog();
    }

    public String toString() {
		return "ChainRing: " + getChainRing() + ", Cog: " + getCog();
    }
    
    // public double getGearInches() {
    //     return ratio * (rim + (tire * 2));
    // }
}
