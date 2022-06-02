package ch.teko.prg2.tag05.solution.ue_generics;

import java.util.HashSet;

public class Formular<A, B> {
    private A pflichtDokument1;
    private B pflichtDokument2;

    // Zusatzdokumente
    private HashSet<Dokument> dokumente = new HashSet<>();

    public Formular(A pflichtDokument1, B pflichtDokument2) {
        this.pflichtDokument1 = pflichtDokument1;
        this.pflichtDokument2 = pflichtDokument2;
    }

    public void fügeZusatzdokumentHinzu(Dokument d) {
        this.dokumente.add(d);
    }

    public void löscheZusatzdokument(Dokument d) {
        this.dokumente.remove(d);
    }

    public A getPflichtDokument1() {
        return pflichtDokument1;
    }

    public B getPflichtDokument2() {
        return pflichtDokument2;
    }

    public HashSet<Dokument> getDokumente() {
        return dokumente;
    }

    public void printAnmeldeformular() {
        System.out.println("Folgende Dokumente wurden für das Formular abgegeben:");
        System.out.println("Pflichtdokumente:");
        System.out.printf("%s \n%s \n \n", this.getPflichtDokument1().toString(), this.getPflichtDokument2().toString());

        System.out.println("Zusatzdokumente:");
        for (Dokument dokument : this.getDokumente()) {
            System.out.println(dokument.toString());
        }

        System.out.println("\n");
    }
}
