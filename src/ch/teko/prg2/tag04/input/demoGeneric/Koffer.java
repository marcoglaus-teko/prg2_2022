package ch.teko.prg2.tag04.input.demoGeneric;

public class Koffer <A,B,C,D,E>{
    private A var1;
    private B var2;
    private C var3;
    private D var4;
    private E var5;

    public Koffer(A var1, B var2, C var3, D var4, E var5) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
        this.var5 = var5;
    }

    public A getVar1() {
        return var1;
    }

    public void setVar1(A var1) {
        this.var1 = var1;
    }

    public B getVar2() {
        return var2;
    }

    public void setVar2(B var2) {
        this.var2 = var2;
    }

    public C getVar3() {
        return var3;
    }

    public void setVar3(C var3) {
        this.var3 = var3;
    }

    public D getVar4() {
        return var4;
    }

    public void setVar4(D var4) {
        this.var4 = var4;
    }

    public E getVar5() {
        return var5;
    }

    public void setVar5(E var5) {
        this.var5 = var5;
    }
}
