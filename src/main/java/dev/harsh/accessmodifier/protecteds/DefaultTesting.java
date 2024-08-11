package dev.harsh.accessmodifier.protecteds;

import dev.harsh.accessmodifier.AccessModifiers;
import dev.harsh.accessmodifier.Student;

public class DefaultTesting {
    public static void main(String[] args) {
        Student student = new Student();
//        student.age not accessible
    }

    public static class Abc extends Student {
        public int getAge(){
//            return this.age;
            return 0;
        }
    }

}
