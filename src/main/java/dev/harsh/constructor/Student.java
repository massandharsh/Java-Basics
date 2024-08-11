package dev.harsh.constructor;

public class Student {
    public String name; //Public
    protected int rollNo;//Protected
    int age;//Default
    private int marks;//Private
    //Parametrized
    public Student(String name, int rollNo, int age){
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.marks = 0;
    }
    //Default
    public Student(){
        this("harsh",123,20);
    }

    //Copy constructor
    public Student(Student student){
        this.name = student.name;
        this.marks = student.marks;
        this.rollNo = student.rollNo;
        this.age = student.age;
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
