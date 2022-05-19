package ch.teko.prg2.tag04.input.ue_generics_01;

public class Main {
    public static void main(String[] args) {
        // Ausgabe 1
        Kaefig<Tier> tierKaefig1 = new Kaefig<>();
        tierKaefig1.setTier(new Tier("Fido", "Peter"));
        System.out.println(tierKaefig1.getTier().getBesitzer());

        // Ausgabe 2
        Kaefig<Tier> tierKaefig2 = new Kaefig<>();
        tierKaefig2.setTier(new Hund("Fido", "Michael"));
        System.out.println(tierKaefig2.getTier().getBesitzer());

        // Ausgabe 3
        Kaefig<Vogel> tierKaefig3 = new Kaefig<>();
        // tierKaefig3.setTier(new Hund("Bello", "Manuel"));
        // System.out.println(tierKaefig3.getTier().getBesitzer());
    }
}
