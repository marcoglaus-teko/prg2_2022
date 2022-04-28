package ch.teko.prg2.tag01.input.reptition.demo4.forloop.primechecker;

/**
 * Klass PrimeChecker hat Methoden zum Überprüfen, ob eine Zahl eine Primzahl ist.
 */
public class PrimeChecker {
    /**
     * @param startingNumber
     * @param endNumber
     */
    public void primeCheck(int startingNumber, int endNumber) {
        boolean isPrime;
        String primeNumbersFound = "";

        // 0 und 1 sind keine Primzahlen
        if (startingNumber < 2) {
            startingNumber = 2;
        }

        // Jede Zahl in der mitgegebenen Bereich wird überprueft, ob sie eine Primzahl ist
        for (int i = startingNumber; i <= endNumber; i++) {
            // Primzahlüberpruefung in eine separate Methode ausgelagert
            isPrime = this.checkIfNumberIsPrime(i);
            if (isPrime) {
                primeNumbersFound += i + " ";
            }
        }
        System.out.printf("Prime numbers found between %d and %d are: %s", startingNumber, endNumber, primeNumbersFound);
    }

    /**
     * @param number
     * @return
     */
    private boolean checkIfNumberIsPrime(int number) {
        int result;
        // sobald die Zahl nicht "nur durch 1 und sich selbst" teilbar ist, handelt es sich nicht um eine Primzahl
        for (int i = 2; i < number; i++) {
            result = number % i;

            if (result == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * main()-Methode
     *
     * @param args
     */
    public static void main(String[] args) {
        PrimeChecker pChecker = new PrimeChecker();
        pChecker.primeCheck(0, 20);
    }
}
