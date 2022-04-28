package ch.teko.prg2.tag01.input.reptition.demo2;

public class Bleistift {
    private double price;
    // härte
    private int hardness;

    public Bleistift(double price, int hardness) {
        this.price = price;
        this.hardness = hardness;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHardness() {
        return hardness;
    }

    public void setHardness(int hardness) {
        this.hardness = hardness;
    }
}
