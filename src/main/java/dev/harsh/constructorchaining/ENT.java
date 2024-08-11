package dev.harsh.constructorchaining;

public class ENT extends Doctor{
    private int iq;
    public ENT(String name,int iq) {
        super(name);
        this.iq = iq;
        System.out.println("Ent constructor invoked");

    }

    public int getIq() {
        return iq;
    }
}
