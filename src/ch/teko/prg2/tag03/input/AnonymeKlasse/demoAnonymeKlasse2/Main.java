package ch.teko.prg2.tag03.input.AnonymeKlasse.demoAnonymeKlasse2;

public class Main {

    public static void main(String[] args) {
        // Klasse Dog implementiert das Interface und ein Objekt mit einer Referenz (bello) wird erzeugt.
        Dog bello = new Dog();
        bello.animalSound();

        // Der Variable des Typs Interface IAnimal wird ein Objekt des Typs Dog zugewiesen.
        IAnimal fido = new Dog();
        fido.run();

        // Anonyme Klasse Cat
        IAnimal cat = new IAnimal() {
            @Override
            public void animalSound() {
                System.out.println("Meow!");
            }

            @Override
            public void run() {
                System.out.println("walking!");
            }
        };
        // Referenz (cat) existiert nur innerhalb des Scopes --> Block von main-Methode!
        cat.animalSound();

        // warum geht das nicht?
        //fido.jump();

        // BreakPoint --> Debuggen
        bello.jump();
    }

}
