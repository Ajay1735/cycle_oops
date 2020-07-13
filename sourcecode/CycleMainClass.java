package cycleOops;

import cycleOops.MountainBike;

/*
javac CycleMainClass.java -d classFiles
java -cp classFiles cycleOops.CycleMainClass
*/

public class CycleMainClass {

    public static void main(String[] args) {
        Gear gear1 = new Gear(52, 11);
        System.out.println(gear1.getRatio());

        Gear gear2 = new Gear(30, 27);
        System.out.println(gear2.getRatio());

        Wheel wheel1 = new Wheel(26, 1.5);
        System.out.println(wheel1.getDiameter());
        System.out.println(wheel1.getCircumference());
        
        Wheel wheel2 = new Wheel(24, 1.25);
    	System.out.println(wheel2.getDiameter());
        System.out.println(wheel2.getCircumference());
        
    	Cycle cycle1 = new Cycle(Size.SMALL, gear1, wheel1, "10-chain", 12);
        System.out.println(cycle1.getGearInches());
        
        Cycle cycle2 = new Cycle(Size.MEDIUM, gear2, wheel2, "11-chain", 15);
        System.out.println(cycle2.getGearInches());

        Cycle cycle3 = new MountainBike(Size.SMALL, gear1, wheel1, "10-chain", 12, "aFrontShock", "aRearShock");
        System.out.println(cycle3);

        Cycle cycle4 = new RoadBike(Size.MEDIUM, gear2, wheel2, "10-chain", 15, "green");
        System.out.println(cycle4);

    }

}