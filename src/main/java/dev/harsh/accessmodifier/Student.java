package dev.harsh.accessmodifier;

public class Student{
    public String name; //Public
    protected int rollNo;//Protected
    int age;//Default
    private int marks;//Private
    public Student(String name, int rollNo, int age){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.marks = 0;
    }
    public Student(){
        this("harsh",123,20);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}
