package ch.teko.prg2.tag02.input.ue_oop_02_01;

public class Ausweis {
    private int ausweisNummer;
    private Mensch besitzer;
    private Nation nationalitaet;
    private String ablaufDatum;

    public Ausweis(int ausweisNummer, Mensch besitzer, Nation nationalitaet, String ablaufDatum) {
        this.ausweisNummer = ausweisNummer;
        this.besitzer = besitzer;
        this.nationalitaet = nationalitaet;
        this.ablaufDatum = ablaufDatum;
    }

    public int getAusweisNummer() {
        return ausweisNummer;
    }

    public Mensch getBesitzer() {
        return besitzer;
    }

    public Nation getNationalitaet() {
        return nationalitaet;
    }

    public String getAblaufDatum() {
        return ablaufDatum;
    }

    public void printAusweisInformationen() {
        System.out.printf("Ausweis Nummer: %d%nBesitzer: %s %s, %d cm%nNationalitaet: %s%nAblaufdatum: %s%n",
                this.getAusweisNummer(), this.getBesitzer().getVorname(), this.getBesitzer().getName(),
                this.getBesitzer().getGroesse(), this.getNationalitaet().getKuerzel(), this.getAblaufDatum());
    }
}
