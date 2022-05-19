package ch.teko.prg2.tag04.solution.ue_oop_04_02_02;

public interface IService {
    Artikel search(long ean);

    void add(Artikel artikel, String abteilung);
}
