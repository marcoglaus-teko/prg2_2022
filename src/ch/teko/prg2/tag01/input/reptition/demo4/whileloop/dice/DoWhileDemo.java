package ch.teko.prg2.tag01.input.reptition.demo4.whileloop.dice;

public class DoWhileDemo {
    public static void main(String[] args) {
        int no = 0;
        int dice1, dice2, dice3;

        do {
            dice1 = (int)(Math.random() * 6) + 1;
            dice2 = (int)(Math.random() * 6) + 1;
            dice3 = (int)(Math.random() * 6) + 1;
            no += 1;

        } while (!((dice1==6) && (dice2==6) && (dice3==6)));

        System.out.println("Required " + no + " tries.");
    }
}
