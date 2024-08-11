package dev.harsh.abstraction;

public class Main {
    public static void main(String[] args) {
        Bird b = new Eagle();
        b.fly();
        Bird c = new Chicken();
        c.fly();

    }
}
