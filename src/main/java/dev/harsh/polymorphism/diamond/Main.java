package dev.harsh.polymorphism.diamond;

public class Main {
    public static void main(String[] args) {
        Human human = new Student();
        human.Do();
    }
}
