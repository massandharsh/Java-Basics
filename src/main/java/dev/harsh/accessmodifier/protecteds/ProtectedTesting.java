package dev.harsh.accessmodifier.protecteds;

import dev.harsh.accessmodifier.AccessModifiers;
import dev.harsh.accessmodifier.Student;

public class ProtectedTesting {
    public static void main(String[] args) {
        Student student = new Student();
//        student.rollNo cannot be accessed
    }

    public static class Abc extends Student{
        public int getRollNo(){
            return this.rollNo;
        }
    }

    public static class Def extends Abc{
        public int getRollNo(){
            return this.rollNo;
        }
    }
}
