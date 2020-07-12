package cycleOops;

/*
javac CycleMainClass.java -d classFiles
java -cp classFiles cycleOops.CycleMainClass
*/

public class CycleMainClass {

    public static void main(String[] args) {
        Gear g1 = new Gear(52, 11);
        System.out.println(g1.getRatio());

        Gear g2 = new Gear(30, 27);
        System.out.println(g2.getRatio());

    }

}