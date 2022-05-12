package ch.teko.prg2.tag03.input.AnonymeKlasse.demoAnonymeKlasse2;

public class Dog implements IAnimal {
    @Override
    public void animalSound() {
        System.out.println("Wuff!");
    }

    @Override
    public void run() {
        System.out.println("running!");
    }

    public void jump() {
        new Object() {
            public void jump() {
                System.out.println("JUMP!");
            }
        }.jump();
    }
}
