package ch.teko.prg2.tag04.input.demoAutoboxing;

public class DemoAutoBoxing {
    public static void main(String[] args) {
        Integer integer = new Integer(19);
        Integer integer1 = 19; // Autoboxing

        System.out.println(integer.intValue());
        System.out.println(integer1); // Autoboxing
    }
}
