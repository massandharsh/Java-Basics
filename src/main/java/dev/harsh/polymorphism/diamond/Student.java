package dev.harsh.polymorphism.diamond;

public class Student extends Test implements Doctor,Teacher{
    @Override
    public void Do() {
        System.out.println("Student Do");
    }
}
