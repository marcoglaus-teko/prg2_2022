package ch.teko.prg2.tag01.input.reptition.demo4.switchcase.binaryconverter;

/**
 * Klasse BinaerConverter
 */
public class BinaerConverter {
    // Selbst implementierte Methode
    public String intToBinary(int zahl) {
        String result = "";
        int zwischenresultat;
        while (zahl > 0) {
            zwischenresultat = zahl % 2;
            switch (zwischenresultat) {
                case 0:
                    result += "0";
                    break;
                case 1:
                    result += "1";
                    break;
            }
            zahl = zahl / 2;
        }
        // String resultat spiegeln
        StringBuilder builder = new StringBuilder(result);
        return builder.reverse().toString();
    }

    // In der Wrapperklasse verfügbare statische Methode toBinaryString(...)
    public String intToBinaryConvenientWay(int zahl) {
        return Integer.toBinaryString(zahl);
    }

    // main()-Methode
    public static void main(String[] args) {
        BinaerConverter b = new BinaerConverter();
        System.out.println(b.intToBinary(16));
        System.out.println(b.intToBinaryConvenientWay(16));
    }
}
