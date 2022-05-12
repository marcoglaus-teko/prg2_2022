package ch.teko.prg2.tag03.solution.ue_oop_02_03;

/**
 * Einfaches Interfaces für die Flächen- und Umfangsberechnung.
 * @author Marco Glaus jun.
 * @version 1.0.1
 */
public interface IForms2D {

    /**
     * Berechne die Fläche.
     * @return einen Wert in Double.
     */
    double getArea();

    /**
     * Berechne den Umfang.
     * @return einen Wert in Double.
     */
    double getPerimeter();
}
