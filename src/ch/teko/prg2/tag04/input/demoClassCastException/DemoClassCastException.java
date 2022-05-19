package ch.teko.prg2.tag04.input.demoClassCastException;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoClassCastException {
    public static void main(String[] args) {
        // alte Variante der ArrayList ohne <GENERICS>
        ArrayList oldArrayList = new ArrayList();
        oldArrayList.add(new Teacher("Glaus", "Marco"));
        oldArrayList.add("Hans");
        oldArrayList.add(1.9);
        oldArrayList.add(new Student("Meier", "Hans", 3.9));

        Iterator iterator = oldArrayList.iterator();
        while (iterator.hasNext()) {
            Teacher o = (Teacher) iterator.next();
        }

        // die zuverwendende Variante
        ArrayList<Teacher> newArrayList = new ArrayList<>();
        newArrayList.add(new Teacher("Glaus", "Marco"));
        //newArrayList.add(new Student("Meier", "Hans", 3.9));
    }
}
