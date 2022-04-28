package ch.teko.prg2.tag01.input.reptition.demo4.whileloop.neverending;

/**
 * Klasse Countdown
 */
public class Countdown {
    /**
     * Startwert des Countdowns als Parameterübergabe
     * @param i
     */
    public void neverEndingCountdown(int i) {
        int end = 0;
        while (i > end) {
            i--;
            System.out.println(i);

            // damit nicht zu schnell eine Exception geworfen wird ...
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // falls 1 ereicht wird, wird die Schleife mit einem break verlassen
            if (i==1) {
                break;
            }
        }
        // rekursiver Aufruf
        this.neverEndingCountdown(3);
    }

    public static void main(String[] args) {
        Countdown c = new Countdown();
        c.neverEndingCountdown(10);
    }
}
