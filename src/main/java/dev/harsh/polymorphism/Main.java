package dev.harsh.polymorphism;

public class Main {
    public static void main(String[] args) {
        A a = new D();
        a.Do();
        B b = new D();
        b.Do();
        C c = new C();
        c.Do();
        A x = new C();
        x.Do();
        A aa = new A();
        aa.Do();

        D dd = new D();
        dd.Do(1L);
        ((D)a).Do(2L);
        ((B)c).Do();
        //Human Doctor ENT

    }
}
