package cycleOops;

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
        
    	Cycle cycle1 = new Cycle(gear1, wheel1);
        System.out.println(cycle1.getGearInches());
        
        Cycle cycle2 = new Cycle(gear1, wheel2);
        System.out.println(cycle2.getGearInches());
    
    }

}