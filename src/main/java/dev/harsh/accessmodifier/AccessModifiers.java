package dev.harsh.accessmodifier;

public class AccessModifiers {
    public static class TestingPublic{
        public static void main(String[] args) {
            Student s = new Student();
            s.name = "John";
            System.out.println(s.name);
        }
    }

    public static class TestingProtected{
        public static void main(String[] args) {
            Student s = new Student();
            s.rollNo = 100;
            System.out.println(s.rollNo);
        }
    }

    public static class TestingDefault{
        public static void main(String[] args) {
            Student s = new Student();
            s.age = 42;
            System.out.println(s.age);
        }
    }

    public static class TestingPrivate{
        public static void main(String[] args) {
            Student s = new Student();
//            s.marks = 30; not accessible
        }
    }




}
